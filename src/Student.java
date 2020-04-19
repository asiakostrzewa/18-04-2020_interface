import java.util.*;

public class Student {

    private String firstName;
    private String lastName;
    private String mainLanguage;

    public Student(String firstName, String lastName, String mainLanguage) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mainLanguage = mainLanguage;
    }

    @Override
    public String toString(){
        return firstName + " " + lastName + " " + mainLanguage;
    }

    @Override
    public boolean equals(Object obj){
        if (!(obj instanceof Student)) {
            return false;
        }
        Student theOther = (Student)obj; //mamy siebie i drugiego studenta z takimi samymi danymi
        return  (theOther.mainLanguage.equals(mainLanguage) &&
        theOther.lastName.equals(lastName) &&
        theOther.firstName.equals(firstName));
    }

    @Override
    public int hashCode() {
        return lastName.hashCode(); //zwraca studentów o tym samym nazwisku
    }

    /*public static void main(String[] args) {
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

        /*Set<Map.Entry<String, String>> entrySet = data.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }*/
}

