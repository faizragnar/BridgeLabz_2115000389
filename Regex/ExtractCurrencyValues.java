import java.util.regex.*;
import java.util.*;

public class ExtractCurrencyValues {
    public static List<String> extract(String text) {
        List<String> values = new ArrayList<>();
        Matcher matcher = Pattern.compile("\\$?\\d+\\.\\d{2}").matcher(text);
        while (matcher.find()) {
            values.add(matcher.group());
        }
        return values;
    }
    public static void main(String[] args) {
        System.out.println(extract("The price is $45.99, and the discount is 10.50."));
    }
}