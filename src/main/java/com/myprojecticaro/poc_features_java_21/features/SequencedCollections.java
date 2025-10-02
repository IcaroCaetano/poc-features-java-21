import java.util.*;

public class SequencedCollections {
    public static void run() {
        List<String> list = new ArrayList<>(List.of("A", "B", "C"));

        System.out.println("First: " + list.getFirst());
        System.out.println("Last: " + list.getLast());
        System.out.println("Reversed: " + list.reversed());
    }
}
