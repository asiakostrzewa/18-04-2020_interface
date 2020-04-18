import com.sun.jdi.event.StepEvent;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PlayingWithMaps {
    public static void main(String[] args) {
        //Map<String, String> dictionary = new HashMap<String, String>();
        Map<String, String> dictionary = new HashMap<>();

        dictionary.put("abstract", "używany do metod lub klas.");
        dictionary.put("public", "definicja public");
        dictionary.put("protected", "definicja protected");
        /*String before = dictionary.put("public", "zmieniłem public, co teraz?");
        System.out.println("Wcześniej było: " + before);*/

        String definition = dictionary.get("abstract");
        if (definition != null) {
            System.out.println(definition);
        }

        //przejście z kilku kolekcji na pojedyńczą kolekcję
        Set<String> keywords = dictionary.keySet();
        Collection<String> definitions = dictionary.values();

        /*String x = "asd"; String y = "dsa";
        if (x.equals(y)) {
        }
        x.hashCode();*/

    }
}
