public class CountGreaterThan {
    public static void main(String[] args){
        int[] numbers={10,25,7,42,18,25,30,25};
        int count=0;
        for(int i=0;i<numbers.length;i++){
            if (numbers[i]>20){
                System.out.println(numbers[i]);
                count++;
            }
        }
        System.out.println("Numbers greater than 20: "+count);
    }
}
