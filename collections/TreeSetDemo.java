import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(50);
        numbers.add(20);
        numbers.add(40);
        numbers.add(10);
        numbers.add(30);
        System.out.println(numbers);

        numbers.add(30);
        numbers.add(10);
        numbers.add(50);
        System.out.println(numbers);

        System.out.println("Smallest number: " + numbers.first());
        System.out.println("Largest number: " + numbers.last());

        System.out.println("Value higher than 30: " + numbers.higher(30));
        System.out.println("Value lower than 30: " + numbers.lower(30));

        System.out.println("Ceiling of 30: " + numbers.ceiling(30));
        System.out.println("Floor of 30: " + numbers.floor(30));

        System.out.println("Removed first: " + numbers.pollFirst());
        System.out.println("Removed last: " + numbers.pollLast());
        System.out.println(numbers);

        numbers.remove(30);
        System.out.println(numbers);

        System.out.println(numbers.contains(40));
        System.out.println(numbers.contains(30));
        System.out.println(numbers.isEmpty());

        System.out.println("Number of elements: " + numbers.size());

        numbers.clear();
        System.out.println(numbers);
        System.out.println(numbers.isEmpty());

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println(numbers.descendingSet());

        System.out.println(numbers.headSet(30));
        System.out.println(numbers.tailSet(30));

        System.out.println(numbers.subSet(20, 50));

        System.out.println("Higher than 25: " + numbers.higher(25));
        System.out.println("Lower than 25: " + numbers.lower(25));

        System.out.println("Ceiling of 25: " + numbers.ceiling(25));
        System.out.println("Floor of 25: " + numbers.floor(25));

        TreeSet<Integer> selectedNumbers = new TreeSet<>();
        selectedNumbers.add(20);
        selectedNumbers.add(40);
        selectedNumbers.add(60);
        numbers.retainAll(selectedNumbers);
        System.out.println(numbers);

        numbers.removeAll(selectedNumbers);
        System.out.println(numbers);

        numbers.addAll(selectedNumbers);
        System.out.println(numbers);

        selectedNumbers.add(40);
        selectedNumbers.add(70);
        numbers.addAll(selectedNumbers);
        System.out.println(numbers);

        System.out.println(numbers.containsAll(selectedNumbers));

        selectedNumbers.add(80);
        System.out.println(numbers.containsAll(selectedNumbers));

        System.out.println(numbers.comparator());
    }
}
