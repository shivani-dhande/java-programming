import java.util.HashMap;
import java.util.Map;
public class StudentsMarks {
    public static void main(String[] args) {
        HashMap<String, Integer> marks = new HashMap<>();
        marks.put("Shivani", 85);
        marks.put("Amit", 78);
        marks.put("Dimple", 92);
        marks.put("Rahul", 67);
        System.out.println("Shivani's marks: " + marks.get("Shivani"));

        if (marks.containsKey("Dimple")) {
            System.out.println("Dimple's marks: " + marks.get("Dimple"));
        }

        System.out.println("Total students: " + marks.size());

        for (Map.Entry<String, Integer> entry : marks.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        int total = 0;

        for (int mark : marks.values()) {
            total += mark;
        }

        double average = (double) total / marks.size();
        System.out.println("Average marks: " + average);

        String topStudent = "";
        int highestMarks = 0;

        for (Map.Entry<String, Integer> entry : marks.entrySet()) {
            if (entry.getValue() > highestMarks) {
                highestMarks = entry.getValue();
                topStudent = entry.getKey();
            }
        }

        System.out.println("Top students: " + topStudent);
        System.out.println("Highest marks: " + highestMarks);

        String lowestStudent = "";
        int lowestMarks = Integer.MAX_VALUE;

        for (Map.Entry<String, Integer> entry : marks.entrySet()) {
            if (entry.getValue() < lowestMarks) {
                lowestMarks = entry.getValue();
                lowestStudent = entry.getKey();
            }
        }

        System.out.println("Lowest student: " + lowestStudent);
        System.out.println("Lowest marks: " + lowestMarks);

        for (Map.Entry<String, Integer> entry : marks.entrySet()) {
            String student = entry.getKey();
            int mark = entry.getValue();

            if (mark >= 90) {
                System.out.println(student + " : A");
            } else if (mark >= 75) {
                System.out.println(student + " : B");
            } else if (mark >= 60) {
                System.out.println(student + " : C");
            } else {
                System.out.println(student + " : D");
            }
        }

        marks.put("Amit", 82);
        System.out.println("Updated Amit's marks: " +marks.get("Amit"));

        marks.remove("Rahul");
        System.out.println(marks);
        System.out.println("Total students: " +marks.size());

        marks.put("Neha", 88);
        System.out.println(marks);

        String studentName = "Priya";

        if (marks.containsKey(studentName)) {
            System.out.println(studentName + "'s marks: " + marks.get(studentName));
        } else {
            System.out.println("Student not found");
        }

        int count = 0;

        for (int mark : marks.values()) {
            if (mark >= 80) {
                count++;
            }
        }
        System.out.println("Students with 80 or more: " + count);
    }
}
