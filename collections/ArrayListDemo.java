import java.util.ArrayList;
public class ArrayListDemo {
    public static void main (String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Shivani");
        names.add("Amit");
        names.add("Dimple");
        System.out.println(names);

        names.set(0,"Priya");
        names.remove(1);
        System.out.println(names.size());

        for(int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        System.out.println(names.contains("Priya"));
        System.out.println(names.contains("Amit"));
        System.out.println(names.isEmpty());

        names.clear();
        System.out.println(names);
        System.out.println(names.isEmpty());
    }
}
