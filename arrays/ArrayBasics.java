public class ArrayBasics {
    public static void main(String[] args){
        int[] marks={75,82,70,90,85};
        int total=0;
        double average=0;
        System.out.println("Marks:");
        for(int i=0;i<marks.length;i++){
            System.out.println(+marks[i]);
            total+=marks[i];
        }
        average=(double)total/marks.length;
        System.out.println("Total: "+total);
        System.out.println("Average "+average);
    }
}
