import java.util.Comparator;

public class DescendingComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer a, Integer b) {
        return Integer.compare(b, a);
    }
}

