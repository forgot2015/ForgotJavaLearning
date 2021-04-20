package book.headfirstjava;


/**
 * Created by forgot on 2017/6/25.
 */
public class ForeachTest {
    public static void main(String[] args) {
        stringTest(new String[]{"name", "dog", "what"});
//        超过 int 的范围了
        System.out.println(calcArea(100000000, 100000000));
//        long 则可以
        System.out.println(calcArea(1000000000L, 1000000000L));
    }

    static void stringTest(Object... args) {
        for (Object s : args) {
            System.out.println(s.toString());
        }
    }

    static int calcArea(int height, int width) {
        return height * width;
    }

    static long calcArea(long height, long width) {
        return height * width;
    }

}
