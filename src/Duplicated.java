import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Duplicated {
    public static void main(String[] args) {
        List<String> strings =
                Arrays.asList("pierwszy", "drugi", "trzeci", "pierwszy", "czwarty", "piaty");
        //Tworzenie zbioru
        Set<String> unique = new HashSet<>(strings);
        unique.addAll(Arrays.asList("czwarty", "szósty", "trzeci"));

        /*lub
        Set<String> unique = new HashSet<>();
        for (String word : strings) {
            unique.add(word);
        }*/

        /*lub
        Set<String> unique = new TreeSet<>(strings);
        unique.addAll(Arrays.asList("czwarty", "szósty", "trzeci"));*/

        System.out.println(strings);
        System.out.println(unique);
    }
}
