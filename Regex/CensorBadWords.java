public class CensorBadWords {
    public static String censor(String text, String[] badWords) {
        for (String word : badWords) {
            text = text.replaceAll("\\b" + word + "\\b", "****");
        }
        return text;
    }
    public static void main(String[] args) {
        String[] badWords = {"damn", "stupid"};
        System.out.println(censor("This is a damn bad example with some stupid words.", badWords));
    }
}