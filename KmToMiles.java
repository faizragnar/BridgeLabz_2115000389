/*Create a program to convert the distance of 10.8 kilometers to miles.
Hint: 1 km = 1.6 miles
I/P => NONE
O/P => The distance  ___ km in miles is ___*/

public class KmToMiles{
	public static void main(String[] args){
		
		double distance_km = 10.8;
		
		double distance_miles = distance_km * 1.6;
		
		System.out.print("The distance 10.8 km in miles is "+ distance_miles);

	}
}