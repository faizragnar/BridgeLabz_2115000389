public class RemoveCharacter {
    public static String removeCharacter(String str, char ch) {
        return str.replace(Character.toString(ch), "");
    }

    public static void main(String[] args) {
        String str = "Hello World";
        char ch = 'l';
        System.out.println("Modified String: " + removeCharacter(str, ch));
    }
}