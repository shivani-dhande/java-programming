public class ThrowDemo {
    public static void main(String[] args) {
        int marks = 150;
        try {
            if (marks < 0 || marks > 100) {
                throw new IllegalArgumentException("Marks must be between 0 and 100");
            }
            System.out.println("Valid marks");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Program continues...");
    }
}
