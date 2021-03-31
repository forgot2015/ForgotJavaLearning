package other.loadsequence;

/**
 * Created by forgot on 6/6/2017.
 * 子类与父类的初始化加载顺序
 * 父类静态代码块+父类静态变量
 * 子类静态代码块+子类静态变量
 * 父类普通代码块
 * 父类加载构造函数
 * 子类普通代码块
 * 子类加载构造函数
 * 子类静态方法
 */
public class InitOrderTest {
    public static void main(String[] args) {

//        new InitOrderSuper();
//        InitOrderSuper.staticMethod();

        new InitOrderSub().staticMethod();
//        InitOrderSub.staticMethod();
//        new InitOrderSub();
    }
}
