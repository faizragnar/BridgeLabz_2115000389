public class Q8_CompareStrings {
    public static void main(String[] args) {
        String str1 = "apple";
        String str2 = "banana";

        int minLength = Math.min(str1.length(), str2.length());

        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                if (str1.charAt(i) < str2.charAt(i)) {
                    System.out.println(str1 + " comes before " + str2 + " in lexicographical order");
                } else {
                    System.out.println(str2 + " comes before " + str1 + " in lexicographical order");
                }
                return;
            }
        }

        if (str1.length() < str2.length()) {
            System.out.println(str1 + " comes before " + str2);
        } else if (str1.length() > str2.length()) {
            System.out.println(str2 + " comes before " + str1);
        } else {
            System.out.println("Both strings are equal");
        }
    }
}