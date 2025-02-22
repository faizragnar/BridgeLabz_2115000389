import java.util.regex.*;
import java.util.*;

public class ExtractProgrammingLanguages {
    public static List<String> extract(String text) {
        List<String> languages = new ArrayList<>();
        Matcher matcher = Pattern.compile("\\b(Java|Python|JavaScript|Go)\\b").matcher(text);
        while (matcher.find()) {
            languages.add(matcher.group());
        }
        return languages;
    }
    public static void main(String[] args) {
        System.out.println(extract("I love Java, Python, and JavaScript, but I haven't tried Go yet."));
    }
}