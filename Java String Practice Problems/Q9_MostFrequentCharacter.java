import java.util.HashMap;

public class MostFrequentCharacter {
    public static char findMostFrequentChar(String str) {
        HashMap<Character, Integer> freqMap = new HashMap<>();
        char maxChar = ' ';
        int maxCount = 0;

        for (char c : str.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
            if (freqMap.get(c) > maxCount) {
                maxCount = freqMap.get(c);
                maxChar = c;
            }
        }

        return maxChar;
    }

    public static void main(String[] args) {
        String str = "success";
        System.out.println("Most Frequent Character: '" + findMostFrequentChar(str) + "'");
    }
}