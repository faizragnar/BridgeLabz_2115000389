public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double totalCost;

    public CarRental() {
        this("Customer", "Standard", 1);
    }

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.totalCost = calculateTotalCost();
    }

    private double calculateTotalCost() {
        double ratePerDay = 50.0;
        return rentalDays * ratePerDay;
    }

    public void display() {
        System.out.println("Customer: " + customerName + ", Car Model: " + carModel + ", Rental Days: " + rentalDays + ", Total Cost: $" + totalCost);
    }
}