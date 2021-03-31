package headfirstjava;

/**
 * Created by forgot on 2017/6/25.
 */
public class Loopy {
    public static void main(String[] args) {
        int x = 1;
        System.out.println("before the loop");
        while (x < 4) {
            System.out.println("in the loop");
            System.out.println("value of x is " + x);
            x++;
        }
        System.out.println("This is after the loop");
    }
}
