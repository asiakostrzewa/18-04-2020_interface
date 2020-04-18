import java.util.HashMap;
import java.util.Map;

public class MapOfNames {
    public static void main(String[] args) {
        //stworzenie mapy, gdzie klucz = Long, ID, a wartość = String, imię
        Map<Long, String> data = new HashMap<Long, String>();

        //Dodanie rekordów/par do mapy. Kilka wartości powinno mieć imię na literę A
        data.put(93920l, "Adam");
        data.put(98937l, "Monika");
        data.put(98785l, "Jan");
        data.put(26472l, "Asia");
        data.put(88176l, "Natalia");
        data.put(98761l, "Robert");
        data.put(23761l, "Jan");

        //Wyświetlanie wszystkich imion zaczynająch się na A:
        for (String value : data.values()) {
            if (value.startsWith("A")) {
                System.out.println(value);
            }
        }

        //Wyświetlanie wszystkich ID z imieniem Jan
        for (Map.Entry<Long, String> entry : data.entrySet()) {
            if ("Jan".equals(entry.getValue())){
                System.out.println("ID: " + entry.getKey() + " to Jan.");
            }
        }
    }
}
