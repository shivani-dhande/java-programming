public class CountNumber {
    public static void main(String[] args){
        int[] numbers={10,25,7,25,42,35,18};
        int target=25;
        boolean found=false;
        int count=0;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==target){
                found=true;
                count++;
            }
        }
        if(found){
            System.out.println(+target+" appears "+count+" times");
        }else{
            System.out.println("Not Found");
        }
    }
}
