import java.util.List;
import java.util.Map;

public class StudentService {

    public double calculateAverage(List<Integer> grades) {
        double sum = 0;
        for(int grade : grades) {
            sum += grade;
        }
        return sum / grades.size(); //dla int sum = 0 trzeba tutaj zrobić * 1.0, żeby był double, czyli po przecinku
    }

    public double calculateTotalAverage(Map<Student, List<Integer>> studentToGrades) {
        double totalAvg = 0;
        for (List<Integer> grades : studentToGrades.values()){
            totalAvg += calculateAverage(grades);
        }
        return totalAvg / studentToGrades.size();
    }

    public Student findBestStudent(Map<Student, List<Integer>> studentToGrades) {
        Student best = null;
        double bestAvg = 0; //minimalna możliwa średnia
        for (Map.Entry<Student, List<Integer>> entry : studentToGrades.entrySet()) {
            double currentAvg = calculateAverage(entry.getValue());
            if (currentAvg > bestAvg) {
                bestAvg = currentAvg;
                best = entry.getKey();
            }
        }
        return best;
    }
}
