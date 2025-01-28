import java.util.Random;
import java.util.Scanner;

public class Q12_StudentScoreCard {

    public static int[][] generateRandomScores(int numStudents) {
        Random random = new Random();
        int[][] scores = new int[numStudents][3];

        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = random.nextInt(100) + 1;
            scores[i][1] = random.nextInt(100) + 1;
            scores[i][2] = random.nextInt(100) + 1;
        }
        return scores;
    }

    public static double[][] calculateScores(int[][] scores, int numStudents) {
        double[][] result = new double[numStudents][4];

        for (int i = 0; i < numStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            result[i][0] = total;
            result[i][1] = Math.round(average * 100.0) / 100.0; // Round to 2 decimal places
            result[i][2] = Math.round(percentage * 100.0) / 100.0; // Round to 2 decimal places

            if (result[i][2] >= 80) {
                result[i][3] = 'A'; // Grade A
            } else if (result[i][2] >= 70) {
                result[i][3] = 'B'; // Grade B
            } else if (result[i][2] >= 60) {
                result[i][3] = 'C'; // Grade C
            } else if (result[i][2] >= 50) {
                result[i][3] = 'D'; // Grade D
            } else if (result[i][2] >= 40) {
                result[i][3] = 'E'; // Grade E
            } else {
                result[i][3] = 'R'; // Grade R (Remedial)
            }
        }
        return result;
    }

    // Method to display the scorecard of all students
    public static void displayScoreCard(int numStudents, int[][] scores, double[][] result) {
        System.out.println("Student Scorecard:");
        System.out.println("Student No.\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");

        for (int i = 0; i < numStudents; i++) {
            System.out.print((i + 1) + "\t\t");
            System.out.print(scores[i][0] + "\t\t" + scores[i][1] + "\t\t" + scores[i][2] + "\t\t");
            System.out.print(result[i][0] + "\t" + result[i][1] + "\t" + result[i][2] + "%\t\t");
            System.out.println((char)result[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        int[][] scores = generateRandomScores(numStudents);

        double[][] result = calculateScores(scores, numStudents);

        displayScoreCard(numStudents, scores, result);
    }
}