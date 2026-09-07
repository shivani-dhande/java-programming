import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> ages = new LinkedHashMap<>();
        ages.put("Shivani", 20);
        ages.put("Amit", 21);
        ages.put("Dimple", 22);
        ages.put("Rahul", 23);
        System.out.println(ages);

        System.out.println(ages.get("Amit"));

        ages.put("Amit", 25);
        System.out.println(ages);

        ages.remove("Dimple");
        System.out.println(ages);

        ages.remove("Amit");
        ages.put("Amit", 25);
        System.out.println(ages);

        System.out.println(ages.containsKey("Shivani"));
        System.out.println(ages.containsValue(25));
        System.out.println(ages.size());

        for (Map.Entry<String, Integer> entry : ages.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println(ages.get("Priya"));

        System.out.println(ages.keySet());
        System.out.println(ages.values());

        System.out.println(ages.isEmpty());

        ages.clear();
        System.out.println(ages);
        System.out.println(ages.isEmpty());

        ages.put("Shivani", 20);
        ages.put("Amit", 21);
        ages.put("Dimple", 22);

        System.out.println(ages.containsKey("Dimple"));
        System.out.println(ages.containsKey("Rahul"));
    }
}
