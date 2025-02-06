import java.util.ArrayList;
import java.util.List;

class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }
}

class Product {
    private String title;

    public Product(String title) {
        this.title = title;
    }
}

class Order {
    private Customer customer;
    private List<Product> products;

    public Order(Customer customer) {
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }
}

public class EcommercePlatform {
    public static void main(String[] args) {
        Customer customer = new Customer("Alex");
        Product laptop = new Product("Laptop");
        Order order = new Order(customer);
        order.addProduct(laptop);
    }
}
