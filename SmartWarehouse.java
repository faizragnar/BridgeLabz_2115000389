abstract class WarehouseItem {
    private String name;
    private double price;
    
    public WarehouseItem(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
}

class Electronics extends WarehouseItem {
    public Electronics(String name, double price) {
        super(name, price);
    }
}

class Groceries extends WarehouseItem {
    public Groceries(String name, double price) {
        super(name, price);
    }
}

class Furniture extends WarehouseItem {
    public Furniture(String name, double price) {
        super(name, price);
    }
}

import java.util.ArrayList;
import java.util.List;

class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();
    
    public void addItem(T item) {
        items.add(item);
    }
    
    public T retrieveItem(int index) {
        if (index >= 0 && index < items.size()) {
            return items.remove(index);
        }
        return null;
    }
    
    public List<T> getItems() {
        return items;
    }
}

class WarehouseUtil {
    public static void displayItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            System.out.println(item.getName() + " - " + item.getPrice());
        }
    }
}

public class SmartWarehouse {
    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop", 1200.0));
        electronicsStorage.addItem(new Electronics("Smartphone", 800.0));

        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("Apple", 1.5));
        groceriesStorage.addItem(new Groceries("Milk", 2.0));
        
        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair", 50.0));
        furnitureStorage.addItem(new Furniture("Table", 120.0));
        
        System.out.println("Electronics in Storage:");
        WarehouseUtil.displayItems(electronicsStorage.getItems());

        System.out.println("\nGroceries in Storage:");
        WarehouseUtil.displayItems(groceriesStorage.getItems());
        
        System.out.println("\nFurniture in Storage:");
        WarehouseUtil.displayItems(furnitureStorage.getItems());
    }
}
