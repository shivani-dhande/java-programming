public class ArraySum {
    public static void main(String[] args){
        int[] numbers={10,20,30,40,50};
        int sum=0;
        for(int j=0;j<numbers.length;j++){
            System.out.println(numbers[j]);
            sum+=numbers[j];
        }
        System.out.println("Total Sum= "+sum);
    }
}
