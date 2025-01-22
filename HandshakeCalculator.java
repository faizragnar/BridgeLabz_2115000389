import java.util.Scanner;

public class HandshakeCalculator {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        
       
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();
        
        // Calculate the maximum number of handshakes
        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        
        // Display the result
        System.out.println("The maximum number of handshakes among " + numberOfStudents + " students is " + maxHandshakes);
        
        
    }
}
