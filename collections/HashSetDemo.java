import java.util.HashSet;
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("Shivani");
        names.add("Amit");
        names.add("Dimple");
        names.add("Shivani");
        System.out.println(names);

        System.out.println(names.contains("Amit"));
        System.out.println(names.contains("Rahul"));

        names.remove("Amit");
        System.out.println(names);

        System.out.println(names.size());

        for (String name : names) {
            System.out.println(name);
        }

        names.add("Shivani");
        names.add("Dimple");

        System.out.println(names.isEmpty());

        names.clear();
        System.out.println(names);
        System.out.println(names.isEmpty());
    }
}
