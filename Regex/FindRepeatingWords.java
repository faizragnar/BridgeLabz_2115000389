import java.util.regex.*;
import java.util.*;

public class FindRepeatingWords {
    public static Set<String> find(String text) {
        Set<String> repeats = new HashSet<>();
        Matcher matcher = Pattern.compile("\\b(\\w+)\\b(?:\\s+\\1\\b)+").matcher(text);
        while (matcher.find()) {
            repeats.add(matcher.group(1));
        }
        return repeats;
    }
    public static void main(String[] args) {
        System.out.println(find("This is is a repeated repeated word test."));
    }
}