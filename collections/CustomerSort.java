import java.util.TreeSet;

public class CustomerSort {
    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>(new DescendingComparator());
        numbers.add(10);
        numbers.add(40);
        numbers.add(20);
        numbers.add(30);
        System.out.println(numbers);
    }
}
