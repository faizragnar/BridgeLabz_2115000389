import java.util.regex.*;
import java.util.*;

public class ExtractLinks {
    public static List<String> extract(String text) {
        List<String> links = new ArrayList<>();
        Matcher matcher = Pattern.compile("https?://\\S+").matcher(text);
        while (matcher.find()) {
            links.add(matcher.group());
        }
        return links;
    }
    public static void main(String[] args) {
        System.out.println(extract("Visit https://www.google.com and http://example.org for more info."));
    }
}