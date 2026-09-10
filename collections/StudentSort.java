import java.util.Comparator;
import java.util.TreeSet;

public class StudentSort {
    public static void main(String[] args) {

        TreeSet<StudentRecord> students = new TreeSet<>(
                Comparator.comparingInt((StudentRecord s) -> s.marks)
                        .reversed()
                        .thenComparing(s -> s.name)
        );

        students.add(new StudentRecord("Shivani", 85));
        students.add(new StudentRecord("Amit", 78));
        students.add(new StudentRecord("Dimple", 92));
        students.add(new StudentRecord("Neha", 88));
        students.add(new StudentRecord("Priya", 85));
        students.add(new StudentRecord("Riya", 85));
        students.add(new StudentRecord("Kiran", 78));
        students.add(new StudentRecord("Aarav", 85));
        System.out.println(students);
    }
}
