import java.util.Scanner;

public class Q6MeanHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] heights = new double[11];
        double sum = 0.0;

        System.out.println("Enter the heights of 11 players (in cm):");
		
        for (int i = 0; i < 11; i++) {
          
            heights[i] = sc.nextDouble();
            sum += heights[i];
        }

        double mean = sum / 11;

        System.out.println("\nThe mean height of the football team is: " + mean + " cm");

       
    }
}
