import java.util.regex.*;

public class ValidateIPAddress {
    public static boolean isValid(String ip) {
        return ip.matches("^(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])\\.(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])\\.(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])\\.(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])$");
    }
    public static void main(String[] args) {
        System.out.println(isValid("192.168.1.1"));
        System.out.println(isValid("256.100.50.25"));
    }
}