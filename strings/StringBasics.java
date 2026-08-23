public class StringBasics {
    public static void main(String[] args){
        String name = "Shivani";
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.charAt(4));
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        if(name.equals("Shivani")){
            System.out.println("Name matches");
        }else{
            System.out.println("Name doesn't match");
        }
    }
}
