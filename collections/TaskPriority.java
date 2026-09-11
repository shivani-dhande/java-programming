import java.util.PriorityQueue;

public class TaskPriority {
    public static void main(String[] args) {

        PriorityQueue<Integer> priorities = new PriorityQueue<>();
        priorities.add(3);
        priorities.add(1);
        priorities.add(4);
        priorities.add(2);
        System.out.println("Starting task processing...");

        while (!priorities.isEmpty()) {
            System.out.println("Processing priority: " + priorities.poll());
        }
        System.out.println("All tasks completed");
    }
}
