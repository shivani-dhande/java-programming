import java.util.ArrayList;
public class StudentList {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Shivani");
        students.add("Amit");
        students.add("Dimple");
        students.add("Rahul");
        students.add("Priya");
        System.out.println(students);

        System.out.println(students.get(2));

        students.set(3,"Rohan");
        System.out.println(students);

        students.remove(1);
        System.out.println(students);

        System.out.println(students.contains("Dimple"));
        System.out.println(students.contains("Amit"));

        System.out.println(students.size());

        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }

        System.out.println(students.isEmpty());

        students.clear();
        System.out.println(students);
        System.out.println(students.isEmpty());

        students.add("Neha");
        students.add("Karan");
        System.out.println(students);

        for (String student : students) {
            System.out.println(student);
        }
    }
}
