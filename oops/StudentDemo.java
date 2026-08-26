public class StudentDemo {
    public static void main(String[] args){
        Student student1= new Student("Shivani", 20, 85);
        Student student2= new Student("Amit", 21, 78);
        Student student3= new Student("Dimple", 20, 88);

        student1.setMarks(150);

        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();

        System.out.println(student1.getName());
        System.out.println(student1.getMarks());
    }
}
