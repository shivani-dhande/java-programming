public class ArrayException {
    public static void main(String[] args) {
        int[] numbers = {10,20,30};
        try {
            System.out.println(numbers[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index");
        }
        System.out.println("Program continues...");
    }
}
