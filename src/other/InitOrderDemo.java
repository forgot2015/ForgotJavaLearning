package other;

/**
 * Created by forgot on 6/6/2017.
 * 加载顺序
 * 父类静态代码块+父类静态变量
 子类静态代码块+子类静态变量
 父类普通代码块
 父类加载构造函数
 子类普通代码块
 子类加载构造函数
 子类静态方法
 */
public class InitOrderDemo {
    public static void main(String[] args){

//        new InitOrderSuper();
//        InitOrderSuper.staticMethod();

        new InitOrderSub().staticMethod();

//        InitOrderSub.staticMethod();
//        new InitOrderSub();
    }
}
