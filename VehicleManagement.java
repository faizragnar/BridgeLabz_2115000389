public class VehicleManagement {
    public static void main(String[] args) {
        PetrolVehicle petrolCar = new PetrolVehicle(180, "Toyota", 50);
        ElectricVehicle electricCar = new ElectricVehicle(150, "Tesla", 300);
        petrolCar.refuel();
        electricCar.charge();
    }
}

class Vehicle {
    protected int maxSpeed;
    protected String model;

    public Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }
}

interface Refuelable {
    void refuel();
}

class PetrolVehicle extends Vehicle implements Refuelable {
    private int fuelCapacity;

    public PetrolVehicle(int maxSpeed, String model, int fuelCapacity) {
        super(maxSpeed, model);
        this.fuelCapacity = fuelCapacity;
    }

    @Override
    public void refuel() {
        System.out.println(model + " is refueling with capacity: " + fuelCapacity + " liters.");
    }
}

class ElectricVehicle extends Vehicle {
    private int batteryCapacity;

    public ElectricVehicle(int maxSpeed, String model, int batteryCapacity) {
        super(maxSpeed, model);
        this.batteryCapacity = batteryCapacity;
    }

    public void charge() {
        System.out.println(model + " is charging with battery capacity: " + batteryCapacity + " kWh.");
    }
}
