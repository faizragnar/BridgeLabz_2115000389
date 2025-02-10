abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    public abstract double calculateFare(double distance);

    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate per Km: $" + ratePerKm);
    }
}

interface GPS {
    void getCurrentLocation();
    void updateLocation(String newLocation);
}

class Car extends Vehicle implements GPS {
    private String currentLocation;

    public Car(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    @Override
    public void getCurrentLocation() {
        System.out.println("Current Location of Car " + getVehicleId() + ": " + currentLocation);
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
        System.out.println("Car " + getVehicleId() + " location updated to: " + newLocation);
    }
}

class Bike extends Vehicle implements GPS {
    private String currentLocation;

    public Bike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() * 0.8;
    }

    @Override
    public void getCurrentLocation() {
        System.out.println("Current Location of Bike " + getVehicleId() + ": " + currentLocation);
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
        System.out.println("Bike " + getVehicleId() + " location updated to: " + newLocation);
    }
}

class Auto extends Vehicle implements GPS {
    private String currentLocation;

    public Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() * 1.2;
    }

    @Override
    public void getCurrentLocation() {
        System.out.println("Current Location of Auto " + getVehicleId() + ": " + currentLocation);
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
        System.out.println("Auto " + getVehicleId() + " location updated to: " + newLocation);
    }
}

public class RideHailingApp {
    public static void main(String[] args) {
        Vehicle car = new Car("C001", "Alice", 2.5);
        Vehicle bike = new Bike("B001", "Bob", 1.5);
        Vehicle auto = new Auto("A001", "Charlie", 2.0);

        ((GPS) car).updateLocation("123 Main St");
        ((GPS) bike).updateLocation("456 Elm St");
        ((GPS) auto).updateLocation("789 Oak St");

        car.getVehicleDetails();
        System.out.println("Fare for 10 km: $" + car.calculateFare(10));
        ((GPS) car).getCurrentLocation();

        bike.getVehicleDetails();
        System.out.println("Fare for 10 km: $" + bike.calculateFare(10));
        ((GPS) bike).getCurrentLocation();

        auto.getVehicleDetails();
        System.out.println("Fare for 10 km: $" + auto.calculateFare(10));
        ((GPS) auto).getCurrentLocation();
    }
}