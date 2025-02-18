abstract class Product<T> {
    private String name;
    private double price;
    private T category;

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public T getCategory() {
        return category;
    }
}

class BookCategory {
    private String genre;

    public BookCategory(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }
}

class ClothingCategory {
    private String type;

    public ClothingCategory(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

class GadgetCategory {
    private String brand;

    public GadgetCategory(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}

class Book extends Product<BookCategory> {
    public Book(String name, double price, BookCategory category) {
        super(name, price, category);
    }
}

class Clothing extends Product<ClothingCategory> {
    public Clothing(String name, double price, ClothingCategory category) {
        super(name, price, category);
    }
}

class Gadget extends Product<GadgetCategory> {
    public Gadget(String name, double price, GadgetCategory category) {
        super(name, price, category);
    }
}

class MarketplaceUtil {
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double discountAmount = product.getPrice() * (percentage / 100);
        product.setPrice(product.getPrice() - discountAmount);
    }
}

public class OnlineMarketplace {
    public static void main(String[] args) {
        Book book = new Book("Java Programming", 50.0, new BookCategory("Education"));
        Clothing clothing = new Clothing("T-Shirt", 20.0, new ClothingCategory("Casual"));
        Gadget gadget = new Gadget("Smartphone", 600.0, new GadgetCategory("Tech"));
        
        System.out.println("Original Prices:");
        System.out.println(book.getName() + " - " + book.getPrice());
        System.out.println(clothing.getName() + " - " + clothing.getPrice());
        System.out.println(gadget.getName() + " - " + gadget.getPrice());
        
        MarketplaceUtil.applyDiscount(book, 10);
        MarketplaceUtil.applyDiscount(clothing, 15);
        MarketplaceUtil.applyDiscount(gadget, 5);
        
        System.out.println("\nPrices after Discount:");
        System.out.println(book.getName() + " - " + book.getPrice());
        System.out.println(clothing.getName() + " - " + clothing.getPrice());
        System.out.println(gadget.getName() + " - " + gadget.getPrice());
    }
}
