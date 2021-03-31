package other.loadsequence;

/**
 * Created by forgot on 6/6/2017.
 */
public class InitOrderSuper {
    public static void main(String[] args) {
        //隐藏下面两句，会出现静态代码块+静态变量
        staticMethod();
        new InitOrderSuper();
    }

    public static void staticMethod() {
        System.out.println("父类静态方法");
    }

    {
        System.out.println("父类普通代码块");
    }

    static String string = "父类静态变量";

    static {
        System.out.println("父类静态代码块+" + string);
    }
    //静态代码块和静态变量加载顺序有代码顺序决定，如下面的string还没加载就会报错
//static String string="静态变量";


    public InitOrderSuper() {
        System.out.println("父类加载构造函数");
    }
}
