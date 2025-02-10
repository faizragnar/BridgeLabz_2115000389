abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void getItemDetails() {
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: $" + calculateTotalPrice());
    }

    public abstract double calculateTotalPrice();
}

interface Discountable {
    double applyDiscount(double discountPercentage);
    String getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public double applyDiscount(double discountPercentage) {
        return calculateTotalPrice() * (1 - discountPercentage / 100);
    }

    @Override
    public String getDiscountDetails() {
        return "Veg items eligible for discount.";
    }
}

class NonVegItem extends FoodItem implements Discountable {
    private static final double EXTRA_CHARGE = 2.0;

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price + EXTRA_CHARGE, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public double applyDiscount(double discountPercentage) {
        return calculateTotalPrice() * (1 - discountPercentage / 100);
    }

    @Override
    public String getDiscountDetails() {
        return "Non-Veg items have an additional charge of $" + EXTRA_CHARGE + " per item.";
    }
}

public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        FoodItem vegItem = new VegItem("Paneer Butter Masala", 10.0, 2);
        FoodItem nonVegItem = new NonVegItem("Chicken Biryani", 12.0, 1);

        vegItem.getItemDetails();
        nonVegItem.getItemDetails();

        Discountable discountableVeg = (VegItem) vegItem;
        System.out.println("Discounted Price: $" + discountableVeg.applyDiscount(10));
        System.out.println(discountableVeg.getDiscountDetails());

        Discountable discountableNonVeg = (NonVegItem) nonVegItem;
        System.out.println("Discounted Price: $" + discountableNonVeg.applyDiscount(15));
        System.out.println(discountableNonVeg.getDiscountDetails());
    }
}
