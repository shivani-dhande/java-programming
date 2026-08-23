public class StringContains {
    public static void main(String[] args){
        String message= "I am learning Java";
        String word="Hello";
        if(message.contains(word)){
            System.out.println(word+ " is present");
        }else{
            System.out.println(word+ " not present");
        }
    }
}
