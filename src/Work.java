import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Work {
    public static void main(String[] args) {
        List<Worker> workers = new ArrayList<>();
        workers.add(new Worker("Adam", 7));
        workers.add(new Worker("Jan", 8));
        workers.add(new Worker("Marian", 9));
        workers.add(new Worker("Grażyna", 7));

        //zasymuluj opóźnienie uruchomienia
        ScheduledExecutorService executors = Executors.newScheduledThreadPool(4);
        for (Worker worker : workers) {
            executors.schedule(worker, worker.getDelay(), TimeUnit.SECONDS);
        }

        /*for (Worker worker : workers) {
            new Thread(worker).start();
        }*/

        while (!workers.isEmpty()){
            try {
                Thread.sleep(30 * 1000);
                releaseRandomWorker(workers);
            } catch (InterruptedException e) {
                System.err.println("interrupted");
            }
        }
    }

    private static void releaseRandomWorker(List<Worker> workers) {
        Worker work = randomWorker(workers);
        work.release();
        workers.remove(work);
        for (Worker worker : workers) {
            worker.updateFrequency();
        }
    }

    private static Worker randomWorker (List<Worker> workers) {
        Random r = new Random();
        int toRelease = r.nextInt(workers.size());
        return workers.get(toRelease);
    }
}