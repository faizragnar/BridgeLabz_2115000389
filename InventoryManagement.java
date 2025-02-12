class Item {
    int itemId;
    String itemName;
    int quantity;
    double price;
    Item next;

    public Item(int itemId, String itemName, int quantity, double price) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}

class InventoryManagement {
    private Item head = null;

    public void addItemAtEnd(int itemId, String itemName, int quantity, double price) {
        Item newItem = new Item(itemId, itemName, quantity, price);
        if (head == null) {
            head = newItem;
        } else {
            Item current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newItem;
        }
    }

    public void removeItemById(int itemId) {
        if (head == null) {
            System.out.println("Inventory is empty.");
            return;
        }
        if (head.itemId == itemId) {
            head = head.next;
            System.out.println("Item removed: " + itemId);
            return;
        }
        Item current = head, prev = null;
        while (current != null && current.itemId != itemId) {
            prev = current;
            current = current.next;
        }
        if (current == null) {
            System.out.println("Item not found: " + itemId);
            return;
        }
        prev.next = current.next;
        System.out.println("Item removed: " + itemId);
    }

    public void updateItemQuantity(int itemId, int newQuantity) {
        Item current = head;
        while (current != null) {
            if (current.itemId == itemId) {
                current.quantity = newQuantity;
                System.out.println("Updated quantity for Item ID " + itemId + " to " + newQuantity);
                return;
            }
            current = current.next;
        }
        System.out.println("Item not found: " + itemId);
    }

    public void searchItemById(int itemId) {
        Item current = head;
        while (current != null) {
            if (current.itemId == itemId) {
                System.out.println("Item Found: " + current.itemName + " (ID: " + itemId + ") Quantity: " + current.quantity + " Price: " + current.price);
                return;
            }
            current = current.next;
        }
        System.out.println("Item not found: " + itemId);
    }

    public void calculateTotalValue() {
        double totalValue = 0;
        Item current = head;
        while (current != null) {
            totalValue += current.quantity * current.price;
            current = current.next;
        }
        System.out.println("Total Inventory Value: $" + totalValue);
    }

    public void displayAllItems() {
        if (head == null) {
            System.out.println("Inventory is empty.");
            return;
        }
        Item current = head;
        while (current != null) {
            System.out.println("Item ID: " + current.itemId + ", Name: " + current.itemName + ", Quantity: " + current.quantity + ", Price: $" + current.price);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        InventoryManagement inventory = new InventoryManagement();
        
        inventory.addItemAtEnd(101, "Laptop", 5, 1200.50);
        inventory.addItemAtEnd(102, "Smartphone", 10, 799.99);
        inventory.addItemAtEnd(103, "Tablet", 8, 450.75);

        System.out.println("All Inventory Items:");
        inventory.displayAllItems();

        System.out.println("Updating Quantity of Item ID 102...");
        inventory.updateItemQuantity(102, 15);

        System.out.println("Searching for Item ID 103:");
        inventory.searchItemById(103);

        System.out.println("Calculating Total Inventory Value...");
        inventory.calculateTotalValue();

        System.out.println("Removing Item ID 101...");
        inventory.removeItemById(101);

        System.out.println("Final Inventory List:");
        inventory.displayAllItems();
    }
}
