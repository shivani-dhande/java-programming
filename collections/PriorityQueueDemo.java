import java.util.PriorityQueue;
import java.util.Comparator;

public class PriorityQueueDemo {
    public static void main(String[] args) {

        PriorityQueue<Integer> numbers = new PriorityQueue<>();
        numbers.add(40);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        System.out.println(numbers);

        System.out.println("Highest priority: " + numbers.peek());

        System.out.println("Removed: " + numbers.poll());
        System.out.println(numbers);

        numbers.add(5);
        System.out.println(numbers);
        System.out.println("Highest priority: " + numbers.peek());

        System.out.println("Removed using remove: " + numbers.remove(30));
        System.out.println(numbers);

        System.out.println(numbers.contains(20));
        System.out.println(numbers.contains(30));

        System.out.println("Size: " + numbers.size());
        System.out.println("Is empty: " + numbers.isEmpty());

        numbers.clear();
        System.out.println(numbers);
        System.out.println("Is empty: " + numbers.isEmpty());

        PriorityQueue<String> tasks = new PriorityQueue<>();
        tasks.add("Study Java");
        tasks.add("Complete assignment");
        tasks.add("Practice DSA");
        tasks.add("Check email");
        System.out.println(tasks);
        System.out.println("Next task: " + tasks.peek());

        System.out.println("Completed task: " + tasks.poll());
        System.out.println("Next task: " + tasks.peek());

        PriorityQueue<Integer> reverseNumbers = new PriorityQueue<>(Comparator.reverseOrder());
        reverseNumbers.add(40);
        reverseNumbers.add(10);
        reverseNumbers.add(30);
        reverseNumbers.add(20);
        System.out.println("Highest priority: " + reverseNumbers.peek());

        PriorityQueue<String> longestTasks = new PriorityQueue<>(
                (a, b) -> Integer.compare(b.length(), a.length())
        );
        longestTasks.add("Java");
        longestTasks.add("DSA");
        longestTasks.add("Programming");
        longestTasks.add("SQL");
        System.out.println("Highest priority: " + longestTasks.peek());
    }
}
