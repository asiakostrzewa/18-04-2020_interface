import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PlayingWithCollections {

    public static void main(String[] args) {
        //Tworzenie listy liczb całkowitych
        List<Integer> numbers = new ArrayList<Integer>(20); //lista przetrzymuje Integery (obiekty danej klasy)
        //Losowanie 20 elementów i wrzucenie ich do naszej tablicy
        Random random = new Random(); //ziarno seed pseud-random numbers
        for (int i=0; i<20; i++) {
            int number = random.nextInt(11);
            numbers.add(number); //add dorzuca na koniec listy niezależnie czy jest to Array czy LinkedList
        }
        //Wyświetlanie zawartości listy
        for (int number : numbers) { //int - typy podstawowe
            System.out.print(number + " ");
        }
        //Usuwanie z listy wszystkich liczb parzystych
        for (int i = 0; i < numbers.size(); i++) { //.size pobiera listę elementów
            int number = numbers.get(i); //.get pobiera element
            if(number % 2 == 0) {
                numbers.remove(i);
                i--;
            }
        }
        //Wyświetlanie zawartości listy
        System.out.println();
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
