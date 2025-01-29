public class ReplaceWord {
    public static String replaceWord(String sentence, String oldWord, String newWord) {
        return sentence.replace(oldWord, newWord);
    }

    public static void main(String[] args) {
        String sentence = "Java is fun";
        String oldWord = "Java";
        String newWord = "Programming";
        System.out.println("Modified Sentence: " + replaceWord(sentence, oldWord, newWord));
    }
}