import java.util.HashMap;
import java.util.Map;
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> ages = new HashMap<>();
        ages.put("Shivani", 20);
        ages.put("Amit", 21);
        ages.put("Dimple", 22);
        System.out.println(ages);

        System.out.println(ages.get("Shivani"));

        ages.put("Shivani", 21);
        System.out.println(ages);

        ages.remove("Amit");
        System.out.println(ages);

        System.out.println(ages.containsKey("Shivani"));
        System.out.println(ages.containsKey("Amit"));

        System.out.println(ages.containsValue(21));
        System.out.println(ages.containsValue(25));

        System.out.println(ages.size());

        for (Map.Entry<String, Integer> entry : ages.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        System.out.println(ages.isEmpty());

        ages.clear();
        System.out.println(ages);
        System.out.println(ages.isEmpty());

        ages.put("Shivani", 20);
        ages.put("Dimple", 22);
        System.out.println(ages);

        System.out.println(ages.getOrDefault("Shivani", 0));
        System.out.println(ages.getOrDefault("Rahul", 0));

        System.out.println(ages.keySet());
        System.out.println(ages.values());
    }
}
