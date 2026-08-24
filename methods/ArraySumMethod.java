public class ArraySumMethod {
    static int arraySum(int[] numbers){
        int total=0;
        for(int i=0;i<numbers.length;i++) {
            total += numbers[i];
        }
        return total;
    }
    public static void main(String[] args){
        int[] numbers= {10,20,30,40,50};
        int result=arraySum(numbers);
        System.out.println(result);
    }
}
