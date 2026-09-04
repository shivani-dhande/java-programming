import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Shivani");
        names.add("Amit");
        names.add("Shivani");
        names.add("Dimple");
        names.add("Amit");
        System.out.println("Original list: "+names);

        HashSet<String> uniqueNames =  new HashSet<>(names);
        System.out.println("Without duplicates: "+uniqueNames);
    }
}
