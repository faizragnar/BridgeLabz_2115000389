import java.util.*;
public class ShoppingCart {
    Map<String, Double> productPrices = new HashMap<>();
    Map<String, Double> orderedCart = new LinkedHashMap<>();
    public void addProduct(String name, double price) {
        productPrices.put(name, price);
        orderedCart.put(name, price);
    }
    public Map<String, Double> getSortedByPrice() { return new TreeMap<>(productPrices); }
}