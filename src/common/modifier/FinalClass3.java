package common.modifier;

/**
 * Created by forgot on 2017/1/8.
 */
public class FinalClass3 {
    /*定义一个静态内部类,里面包含静态方法和静态变量*/
    public final static class FinalClass3Static {
        public static String string = "这是FinalClass3的的静态内部类FinalClass3Static的final3Method()";
        public static void final3Method() {
            System.out.println(string);
        }
    }

}
