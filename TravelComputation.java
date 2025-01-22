import java.util.Scanner;

public class TravelComputation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking input from user
        System.out.print("Enter the traveler's name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter the starting city: ");
        String fromCity = sc.nextLine();
        
        System.out.print("Enter the via city: ");
        String viaCity = sc.nextLine();
        
        System.out.print("Enter the destination city: ");
        String toCity = sc.nextLine();
        
        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " (in km): ");
        double distanceFromToVia = sc.nextDouble();
        
        System.out.print("Enter the travel time from " + fromCity + " to " + viaCity + " (in minutes): ");
        int timeFromToVia = sc.nextInt();
        
        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " (in km): ");
        double distanceViaToFinalCity = sc.nextDouble();
        
        System.out.print("Enter the travel time from " + viaCity + " to " + toCity + " (in minutes): ");
        int timeViaToFinalCity = sc.nextInt();
        
        // Calculating total distance and time
        double totalDistance = distanceFromToVia + distanceViaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;
        
        // Printing the travel details
        System.out.println("The Total Distance travelled by " + name + " from " + fromCity + " to " + toCity + " via " + viaCity +" is " + totalDistance + " km and " +" the Total Time taken is " + totalTime + " minutes");
        
       
    }
}