public class ReplaceMultipleSpaces {
    public static String replace(String text) {
        return text.replaceAll("\\s+", " ");
    }
    public static void main(String[] args) {
        System.out.println(replace("This is  an   example    with multiple   spaces."));
    }
}