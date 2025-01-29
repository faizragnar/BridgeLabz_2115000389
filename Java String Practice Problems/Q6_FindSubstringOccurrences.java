public class Q6_FindSubstringOccurrences {
    public static int countOccurrences(String str, String sub) {
        int count = 0, index = 0;
        while ((index = str.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "banana banana";
        String sub = "ana";
        System.out.println("Occurrences of '" + sub + "': " + countOccurrences(str, sub));
    }
}