public class Printer implements Runnable {
    private boolean isActive;

    private String text;

    private int time;

    private int counter = 0;

    public Printer(String text, int time) {
        this.text = text;
        this.time = time;
        this.isActive = true;
    }

    public void deactivate(){
        this.isActive = false;
    }

    @Override
    public void run() {
        while (isActive) {
            System.out.println(text + " " + counter);
            counter++;
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                System.err.println(" interrupted" + text + " " + counter);
            }
            System.out.println(text);
        }
        //deadlock - zakleszczenie
        //starvation - zagłodzenie
    }
}
