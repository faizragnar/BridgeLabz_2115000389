/*Write a Program to compute the volume of Earth in km^3 and miles^3
Hint => Volume of a Sphere is (4/3) * pi * r^3 and radius of earth is 6378 km
O/P => The volume of earth in cubic kilometers is ____ and cubic miles is ____
*/

public class EarthVolume {
    public static void main(String[] args) {
        
        double radiuskm = 6378; 
        double kmToMiles = 0.6213;

        double volume_km = (4/3) * Math.PI * Math.pow(radiuskm, 3);

        double radiusMiles = radiuskm * kmToMiles;
		
        double volume_miles = (4/3) * Math.PI * Math.pow(radiusMiles, 3);

        System.out.printf("The volume of Earth in cubic kilometers is %.2f and in cubic miles is %.2f", volume_km, volume_miles);
    }
}
