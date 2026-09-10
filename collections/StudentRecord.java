public class StudentRecord {

    String name;
    int marks;

    public StudentRecord(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return name + " : " + marks;
    }
}
