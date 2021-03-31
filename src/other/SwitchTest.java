package other;

/**
 * Created by forgot on 2017/6/14.
 */
public class SwitchTest {
    public static void main(String[] args) {
        int x = 0;
        switch (x) {
            default:
                System.out.println("default");
            case 1:
                System.out.println(1);
            case 2:
                System.out.println(2);
        }

        switch (x) {
            case 1:
                System.out.println(1);
            case 2:
                System.out.println(2);
            default:
                System.out.println("default");
        }
    }
}
