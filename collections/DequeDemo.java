import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DequeDemo {
    public static void main(String[] args) {

        Deque<Integer> numbers = new ArrayDeque<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println(numbers);

        numbers.addFirst(5);
        numbers.addLast(40);
        System.out.println(numbers);

        System.out.println("Removed first: " + numbers.removeFirst());
        System.out.println("Removed last: " + numbers.removeLast());
        System.out.println(numbers);

        System.out.println("First element: " + numbers.getFirst());
        System.out.println("Last element: " + numbers.getLast());

        System.out.println("First element: " + numbers.peekFirst());
        System.out.println("Last element: " + numbers.peekLast());

        numbers.offerFirst(5);
        numbers.offerLast(40);
        System.out.println(numbers);

        System.out.println("Polled first: " + numbers.pollFirst());
        System.out.println("Polled last: " + numbers.pollLast());
        System.out.println(numbers);

        numbers.push(5);
        numbers.push(15);
        System.out.println(numbers);

        System.out.println("Popped: " + numbers.pop());
        System.out.println(numbers);

        numbers.offer(50);
        numbers.offer(60);
        System.out.println(numbers);

        System.out.println("Polled: " + numbers.poll());
        System.out.println(numbers);

        numbers.addLast(20);
        numbers.addLast(30);
        System.out.println(numbers);

        System.out.println(numbers.removeFirstOccurrence(20));
        System.out.println(numbers);

        System.out.println(numbers.removeLastOccurrence(30));
        System.out.println(numbers);

        System.out.println("Reverse order:");
        Iterator<Integer> iterator = numbers.descendingIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Contains 20: " + numbers.contains(20));
        System.out.println("Contains 100: " + numbers.contains(100));

        System.out.println("Size: " + numbers.size());

        System.out.println("Is empty: " + numbers.isEmpty());

        numbers.clear();
        System.out.println(numbers);
        System.out.println("Is empty: " + numbers.isEmpty());
    }
}
