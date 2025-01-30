public class ToggleCase {
    public static String toggleCase(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else {
                sb.append(Character.toUpperCase(c));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("Toggled String: " + toggleCase(str));
    }
}