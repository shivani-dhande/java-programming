import java.util.LinkedHashMap;
import java.util.Map;

public class RecentSearches {
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> searches = new LinkedHashMap<>();
        searches.put(1, "Java");
        searches.put(2, "Python");
        searches.put(3, "SQL");
        searches.put(4, "Git");
        System.out.println(searches);

        for(String search : searches.values()) {
            System.out.println(search);
        }

        searches.put(5, "JavaScript");
        System.out.println(searches);

        searches.remove(2);
        System.out.println(searches);

        searches.put(3, "MySQL");
        System.out.println(searches);

        for (Map.Entry<Integer, String> entry : searches.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println(searches.containsKey(4));
        System.out.println(searches.containsKey(2));

        System.out.println(searches.containsValue("Git"));
        System.out.println(searches.containsValue("Python"));

        System.out.println("Number of searches: " + searches.size());

        Integer firstKey = searches.keySet().iterator().next();
        System.out.println("First search: " + firstKey);
        System.out.println("First search values: " + searches.get(firstKey));

        searches.clear();

        if (!searches.isEmpty()) {
            int key = searches.keySet().iterator().next();
            System.out.println("First key: " + key);
        } else {
            System.out.println("No searches available.");
        }
    }
}
