import java.util.*;
public class GenerateBinaryNumbers {
    public static List<String> generateBinaryNumbers(int n) {
        List<String> result = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();
        queue.add("1");
        for (int i = 0; i < n; i++) {
            String num = queue.remove();
            result.add(num);
            queue.add(num + "0");
            queue.add(num + "1");
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(generateBinaryNumbers(5));
    }
}