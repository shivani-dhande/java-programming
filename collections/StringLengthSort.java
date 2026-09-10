import java.util.Comparator;
import java.util.TreeSet;

public class StringLengthSort {
    public static void main(String[] args) {

        TreeSet<String> names = new TreeSet<>(new Comparator<String>() {

            @Override
            public int compare(String a, String b) {
                int result = Integer.compare(b.length(), a.length());

                if (result == 0) {
                    return b.compareTo(a);
                }
                return result;
            }
        });

        names.add("Shivani");
        names.add("Amit");
        names.add("Dimple");
        names.add("Raj");
        names.add("Neha");
        names.add("Riya");
        System.out.println(names);
    }
}
