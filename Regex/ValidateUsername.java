import java.util.regex.*;

public class ValidateUsername {
    public static boolean isValid(String username) {
        return username.matches("^[a-zA-Z][a-zA-Z0-9_]{4,14}$");
    }
    public static void main(String[] args) {
        System.out.println(isValid("user_123"));
        System.out.println(isValid("123user"));
        System.out.println(isValid("us"));
    }
}