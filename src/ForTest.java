import java.util.ArrayList;
import java.util.List;

public class ForTest {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<Integer>();
        ints.add(1);
        ints.add(2);
        ints.add(3);
        ints.add(4);
        ints.add(5);
        for (int j = 0, size = ints.size(); j < size; j++) {
            System.out.println("j= " + j + ", ints[j] = " + ints.get(j));
            if (ints.get(j) == 3) {
                ints.remove(j);
            }
        }
    }
}
