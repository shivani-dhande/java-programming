public class SmallestNumber {
    public static void main(String[] args){
        int[] numbers={10,25,7,42,18};
        int smallest=numbers[0];
        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
            if(numbers[i]<smallest){
                smallest=numbers[i];
            }
        }
        System.out.println("Smallest Number= "+smallest);
    }
}
