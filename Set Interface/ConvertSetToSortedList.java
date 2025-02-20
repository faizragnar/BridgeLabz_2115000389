import java.util.*;
public class ConvertSetToSortedList {
    public static List<Integer> convertToSortedList(Set<Integer> set) {
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        return list;
    }
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(Arrays.asList(5, 3, 9, 1));
        System.out.println(convertToSortedList(set));
    }
}