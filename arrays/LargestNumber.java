public class LargestNumber {
    public static void main(String[] args) {
        int[] digits = {10, 25, 7, 42, 18};
        int largest = digits[0];
        for(int k=0;k<digits.length;k++) {
            System.out.println(digits[k]);
            if (digits[k] > largest) {
                largest = digits[k];
            }
        }
        System.out.println("Largest number= " + largest);
    }
}
