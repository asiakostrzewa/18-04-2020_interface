import java.util.*;

public class AverageTests {
    public static void main(String[] args) {
        Map<Student, List<Integer>> grades = new HashMap<>();

        Student student1 = new Student("Mateusz", "Chrominski", "PL");
        Student student2 = new Student("Janina", "Zapolska", "PL");
        Student student3 = new Student("Krzysztof", "Chrominski", "EN");


        List<Integer> grades1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> grades2 = new ArrayList<>(Arrays.asList(5, 2, 3, 2, 5));
        List<Integer> grades3 = new ArrayList<>(Arrays.asList(1, 2, 1, 5, 5));

        grades.put(student1, grades1);
        grades.put(student2, grades2);
        grades.put(student3, grades3); //ctrl+d - duplicate

        StudentService srv = new StudentService();
        List<Integer> result = grades.get(student1);
        /*//dodane jeśli mamy takie same dane dla dwóch studentów
        Student test = new Student("Mateusz", "Chrominski", "PL");
        List<Integer> gradesForTestStudent = grades.get(test);*/
        System.out.println(srv.calculateAverage(result));

        for (Student student : grades.keySet()) {
             List<Integer> g = grades.get(student);
            System.out.println(student.toString() + " " + g.toString());
            }
        }
}
