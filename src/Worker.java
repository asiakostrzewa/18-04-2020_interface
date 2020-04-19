import java.time.LocalTime;

public class Worker implements Runnable {

    private String name;
    private int start;
    private boolean working = true;
    private int currentUpdateFrequency = 10;

    public Worker(String name, int start) {
        this.name = name;
        this.start = start;
    }

    public void release() {
        working = false;
        System.out.println(name + "\tkonczy prace");
    }

    public void updateFrequency() {
        if (currentUpdateFrequency > 2) {
            currentUpdateFrequency -=2;
        }
    }

    public long getDelay() {
        return start;
    }

    @Override
    public void run() {
        System.out.println(name + "\tzaczal prace o\t" + LocalTime.now());
        while (working) {
            try {
                Thread.sleep(currentUpdateFrequency * 1000);
            } catch (InterruptedException e) {
            }
            //mogę już nie pracować (working==false), ale ciągle powiem, że pracuję :(
            System.out.println(name + "\tciągle pracuje\t" + LocalTime.now());
        }
    }
}
