public class MultipleException {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            System.out.println(a / b);
        }catch(ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }

        try {
            int[] numbers = {10,20,30};
            System.out.println(numbers[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index");
        }
        System.out.println("Program continues...");
    }
}
