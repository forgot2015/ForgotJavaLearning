package base.variable;

/**
 * Created by forgot on 2017/7/15.
 */
public class OperatorSample2 {
    public static void main(String[] args) {
        byte b = 20 >>> 3;
        String s = Integer.toBinaryString(b);
        System.out.println(b);
        System.out.println(s);
        int c = -20 >> 4;
        int d = 20 >> 4;
        System.out.println(c);
        System.out.println(d);
    }
}
