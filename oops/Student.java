public class Student {
    String name;
    int age;
    int marks;

    Student(String studentName, int studentAge, int studentMarks){
        name=studentName;
        age=studentAge;
        marks=studentMarks;
    }

    void displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Marks: "+marks);
    }
}
