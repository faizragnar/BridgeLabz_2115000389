import java.util.Arrays;

public class AnagramCheck {
    public static boolean areAnagrams(String str1, String str2) {
        char[] arr1 = str1.replaceAll("\s", "").toLowerCase().toCharArray();
        char[] arr2 = str2.replaceAll("\s", "").toLowerCase().toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        System.out.println("Are Anagrams: " + areAnagrams(str1, str2));
    }
}