import java.util.ArrayDeque;
import java.util.Queue;

public class Clinic {
    private Queue<Patient> queue = new ArrayDeque<>(); //LinkedList / bufor przesuwny zaimplementowany na podstawie tablicy

    public static void main(String[] args) {
        Clinic clinic = new Clinic();
        clinic.register("Zbyszek");
        clinic.register("Jurek");
        clinic.handle();
        clinic.register("Julek");
    }

    private void register(String name) {
        queue.add(new Patient(name));
    }

    private Patient handle() {
        Patient toServe = queue.poll();
        System.out.println("Obsługuję: " + toServe);
        System.out.println("W kolejce zostaje: " + queue.size());
        return toServe;
    }
}

