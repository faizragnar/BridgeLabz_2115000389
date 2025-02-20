import java.util.*;
public class FindNthFromEnd {
    public static String find(LinkedList<String> list, int n) {
        ListIterator<String> iter1 = list.listIterator(), iter2 = list.listIterator();
        for (int i = 0; i < n; i++) iter2.next();
        while (iter2.hasNext()) { iter1.next(); iter2.next(); }
        return iter1.next();
    }
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
        System.out.println(find(list, 2));
    }
}