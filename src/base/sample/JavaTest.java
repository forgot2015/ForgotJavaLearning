package base.sample;

/**
 * Created by forgot on 2017/7/1.
 */
public class JavaTest {
    public static void main(String[] args) {
        //在执行if中的语句时，实际上会把testReturn("a")代码给走一边，
        // 也就是会执行到System.out 打印代码
        //新思路，想要执行方法不一定要直接执行 testReturn(s), 用if等语句都行，只要有调用到该方法就能执行了
        if ("a".equals(testReturn("a"))) {
            System.out.println("you press a!");
        }
    }

    private static String testReturn(String s) {
        System.out.println(s);
        return s;
    }
}
