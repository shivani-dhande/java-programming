public class CheckEven {
    static boolean isEven(int number){
        if(number % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        boolean result=isEven(7);
        System.out.println(result);
    }
}
