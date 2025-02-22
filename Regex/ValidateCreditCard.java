import java.util.regex.*;

public class ValidateCreditCard {
    public static boolean isValid(String card) {
        return card.matches("^4\\d{15}$") || card.matches("^5\\d{15}$");
    }
    public static void main(String[] args) {
        System.out.println(isValid("4111111111111111"));
        System.out.println(isValid("5111111111111111"));
        System.out.println(isValid("6111111111111111"));
    }
}