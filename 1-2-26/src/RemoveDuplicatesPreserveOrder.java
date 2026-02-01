import java.util.*;

public class RemoveDuplicatesPreserveOrder {

    public static List<Integer> removeDuplicates(List<Integer> list) {
        Set<Integer> seen = new LinkedHashSet<>(list);
        return new ArrayList<>(seen);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 1, 2, 2, 3, 4);
        System.out.println("After removing duplicates: " + removeDuplicates(list));
    }
}
