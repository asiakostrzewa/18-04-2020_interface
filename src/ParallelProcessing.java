import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ParallelProcessing {
    public static void main(String[] args) {
        List<Printer> printers = new LinkedList<>();
        printers.add(new Printer("pierwszy", 1000));
        printers.add(new Printer("drugi", 1500));
        printers.add(new Printer("trzeci", 2000));
        printers.add(new Printer("czwarty", 2200));

        List<Thread> threads = new ArrayList<>();
        //Printer printer = new Printer("pierwszy");
        for (Printer printer : printers) {
            Thread t = new Thread(printer);
            t.start(); //do odpalenia wątku "pierwszy"
            threads.add(t);
        }

        System.out.println("hello from main");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        printers.get(0).deactivate();
    }
}
