import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {

        TreeMap<Integer, String> students = new TreeMap<>();
        students.put(103, "Dimple");
        students.put(101, "Shivani");
        students.put(104, "Rahul");
        students.put(102, "Amit");
        System.out.println(students);

        System.out.println(students.get(102));

        students.put(102, "Anita");
        System.out.println(students);

        students.remove(104);
        System.out.println(students);

        System.out.println(students.containsKey(101));
        System.out.println(students.containsKey(104));

        System.out.println(students.containsValue("Dimple"));
        System.out.println(students.containsValue("Rahul"));

        System.out.println("First key: " + students.firstKey());
        System.out.println("Last key: " + students.lastKey());

        System.out.println("Key higher than 102: " + students.higherKey(102));
        System.out.println("Key lower than 102: " + students.lowerKey(102));

        System.out.println("Ceiling key of 102: " + students.ceilingKey(102));
        System.out.println("Floor key of 102: " + students.floorKey(102));

        System.out.println("First entry: " + students.firstEntry());
        System.out.println("Last entry: " + students.lastEntry());

        System.out.println("Removed first entry: " + students.pollFirstEntry());
        System.out.println("Removed last entry: " + students.pollLastEntry());

        System.out.println(students);

        students.put(101, "Shivani");
        students.put(103, "Dimple");
        students.put(104, "Rahul");

        System.out.println(students);

        System.out.println(students.subMap(102, 104));
        System.out.println(students.subMap(101, 103));

        System.out.println(students.headMap(103));
        System.out.println(students.tailMap(103));

        System.out.println(students.descendingMap());

        System.out.println(students.descendingKeySet());

        System.out.println("Number of students: " + students.size());
        System.out.println("Is the map empty? " + students.isEmpty());
    }
}
