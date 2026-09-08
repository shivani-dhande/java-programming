import java.util.TreeMap;
import java.util.Map;

public class ProductPrices {
    public static void main(String[] args) {

        TreeMap<Integer, String> products = new TreeMap<>();
        products.put(500, "Keyboard");
        products.put(200, "Mouse");
        products.put(800, "Monitor");
        products.put(300, "Headphones");
        System.out.println("Products by price: ");

        for(Map.Entry<Integer, String> entry : products.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("Cheapest product: " + products.firstEntry());
        System.out.println("Most expensive product: " + products.lastEntry());

        System.out.println("Products between ₹300 and ₹800:");
        System.out.println(products.subMap(300, 800));

        System.out.println("Products from highest to lowest price:");

        for (Map.Entry<Integer, String> entry : products.descendingMap().entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
