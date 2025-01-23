import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age of Amar: ");
        int ageAmar = sc.nextInt();
        System.out.print("Enter age of Akbar: ");
        int ageAkbar = sc.nextInt();
        System.out.print("Enter age of Anthony: ");
        int ageAnthony = sc.nextInt();

        System.out.print("Enter height of Amar: ");
        double heightAmar = sc.nextDouble();
        System.out.print("Enter height of Akbar: ");
        double heightAkbar = sc.nextDouble();
        System.out.print("Enter height of Anthony: ");
        double heightAnthony = sc.nextDouble();

        String youngestFriend;
		
        if (ageAmar < ageAkbar && ageAmar < ageAnthony) {
            youngestFriend = "Amar";
        } else if (ageAkbar < ageAmar && ageAkbar < ageAnthony) {
            youngestFriend = "Akbar";
        } else {
            youngestFriend = "Anthony";
        }

        String tallestFriend;
        if (heightAmar > heightAkbar && heightAmar > heightAnthony) {
            tallestFriend = "Amar";
        } else if (heightAkbar > heightAmar && heightAkbar > heightAnthony) {
            tallestFriend = "Akbar";
        } else {
            tallestFriend = "Anthony";
        }

        System.out.println("\nThe youngest friend is: " + youngestFriend);
        System.out.println("The tallest friend is: " + tallestFriend);

      
    }
}
