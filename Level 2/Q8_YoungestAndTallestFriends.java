import java.util.Scanner;

public class Q8_YoungestAndTallestFriends {

    public static String findYoungest(int[] ages) {
        int youngestAge = ages[0];
        int youngestIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < youngestAge) {
                youngestAge = ages[i];
                youngestIndex = i;
            }
        }
        return youngestIndex == 0 ? "Amar" : youngestIndex == 1 ? "Akbar" : "Anthony";
    }

    public static String findTallest(double[] heights) {
        double tallestHeight = heights[0];
        int tallestIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > tallestHeight) {
                tallestHeight = heights[i];
                tallestIndex = i;
            }
        }
        return tallestIndex == 0 ? "Amar" : tallestIndex == 1 ? "Akbar" : "Anthony";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] ages = new int[3];
        double[] heights = new double[3];

        System.out.print("Enter Amar's age: ");
        ages[0] = scanner.nextInt();
        System.out.print("Enter Amar's height (in cm): ");
        heights[0] = scanner.nextDouble();

        System.out.print("Enter Akbar's age: ");
        ages[1] = scanner.nextInt();
        System.out.print("Enter Akbar's height (in cm): ");
        heights[1] = scanner.nextDouble();

        System.out.print("Enter Anthony's age: ");
        ages[2] = scanner.nextInt();
        System.out.print("Enter Anthony's height (in cm): ");
        heights[2] = scanner.nextDouble();

        String youngest = findYoungest(ages);
        String tallest = findTallest(heights);

        System.out.println("The youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);
    }
}
