import java.util.*;

public class Student {

    public static void main(String[] args) {
        //stworzenie mapy, gdzie klucz = Student (firstname, lastname, mainLanguage), a wartość = lista ocen studenta
        Map<String, String> data = new HashMap<String, String>();

        data.put("Jan Nowak PL", "2, 4, 6, 4");
        data.put("Maciej Paluch PL", "2, 3, 3, 2");
        data.put("Adrian Pielucha EN", "2, 2, 2, 4");
        data.put("Monika Wyścigowa PL", "4, 4, 3, 4");
        data.put("Anita Kowalska PL", "2, 1, 6, 4");
        data.put("Paulina Kij PL", "2, 2, 4, 5");
        data.put("Marian Paderewski PL", "6, 4, 3, 4");

        /*String Student = "Anita Kowalska PL";
        String value = data.get(Student);
        System.out.println(Student + " - " + value);*/

        Set<Map.Entry<String, String>> entrySet = data.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}

