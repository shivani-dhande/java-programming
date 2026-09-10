import java.util.TreeSet;
import java.util.Comparator;

public class TreeSetDescending {
    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>(Comparator.reverseOrder());
        numbers.add(50);
        numbers.add(20);
        numbers.add(40);
        numbers.add(10);
        numbers.add(30);
        System.out.println(numbers);
    }
}
