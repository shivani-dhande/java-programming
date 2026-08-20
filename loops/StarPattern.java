public class StarPattern {
    public static void main(String[] args){
        for(int row=1;row<=5;row++){
            for(int column=1;column<=row;column++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int row1=4;row1>=1;row1--){
            for(int column1=1;column1<=row1;column1++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
