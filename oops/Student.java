public class Student {
    private String name;
    private int age;
    private int marks;

    public Student(String studentName, int studentAge, int studentMarks){
        name=studentName;
        age=studentAge;
        marks=studentMarks;
    }

    void displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Marks: "+marks);
    }

    public String getName(){
        return name;
    }

    public int getMarks(){
        return marks;
    }

    public void setMarks(int marks){
        if(marks>=0 && marks<=100){
            this.marks=marks;
        }else {
            System.out.println("Invalid marks");
        }
    }
}
