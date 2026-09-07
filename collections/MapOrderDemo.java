import java.util.HashMap;
import java.util.LinkedHashMap;

public class MapOrderDemo {
    public static void main(String[] args) {

        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Shivani", 20);
        hashMap.put("Amit", 21);
        hashMap.put("Dimple", 22);
        hashMap.put("Rahul", 23);

        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Shivani", 20);
        linkedHashMap.put("Amit", 21);
        linkedHashMap.put("Dimple", 22);
        linkedHashMap.put("Rahul", 23);

        System.out.println("HashMap: " +hashMap);
        System.out.println("LinkedHashMap: " +linkedHashMap);
    }
}
