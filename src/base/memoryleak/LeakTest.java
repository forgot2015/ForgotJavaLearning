package base.memoryleak;

import java.util.Arrays;
import java.util.Vector;

/**
 * Created by forgot on 2017/7/6.
 */
public class LeakTest {
    public static void main(String[] args) {
        Vector v = new Vector(10);
        for (int i = 1; i < 100; i++) {
            Object o = new Object();
            v.add(o);
            o = null;
        }
        System.out.println(Arrays.toString(v.toArray()));
    }
}
