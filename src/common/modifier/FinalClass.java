package common.modifier;

/**
 * Created by forgot on 2017/1/8.
 * static 表示静态，不用新建实例就能直接引用
 * final 表示最终，修饰变量则无法被改变，修饰方法则无法被基类重写
 * static final一起用，一般表示常量
 */
public class FinalClass {
    public static final String MY_FINAL_STRING = "myFinalString";
    protected static final String MY_FINAL_STRING2 = "myFinalString2";
    static final String MY_FINAL_STRING3 = "myFinalString3";
    private static final String MY_FINAL_STRING4 = "myFinalString4";
    public final String MY_FINAL_STRING5 = "myFinalString5";
    public String MY_FINAL_STRING6 = "myFinalString6";

    public static final void finalMethod1() {
        System.out.println("这是FinalClass下的finalMethod1()方法");
    }
}
