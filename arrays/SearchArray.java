public class SearchArray {
    public static void main(String[] args) {
        int[] numbers = {10, 25, 7, 42, 18};
        int target=42;
        boolean found = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                found = true;
            }
        }
        if (found) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
}
