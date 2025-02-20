import java.util.*;
public class RemoveDuplicates {
    public static List<Integer> remove(List<Integer> list) {
        Set<Integer> seen = new LinkedHashSet<>(list);
        return new ArrayList<>(seen);
    }
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 1, 2, 2, 3, 4);
        System.out.println(remove(list));
    }
}