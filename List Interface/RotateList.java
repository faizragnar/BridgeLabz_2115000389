import java.util.*;
public class RotateList {
    public static List<Integer> rotate(List<Integer> list, int positions) {
        int n = list.size();
        positions %= n;
        List<Integer> rotated = new ArrayList<>(list.subList(positions, n));
        rotated.addAll(list.subList(0, positions));
        return rotated;
    }
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
        System.out.println(rotate(list, 2));
    }
}