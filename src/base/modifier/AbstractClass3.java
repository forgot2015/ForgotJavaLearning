package base.modifier;

/**
 * Created by forgot on 2017/1/8.
 * 继承抽象类，也设置为抽象类，就可以不写实现方法
 */
public abstract class AbstractClass3 extends AbstractClass {
    public static final void NoAbstractMethod() {
        System.out.println("AbstractClass3 下的 NoAbstractMethod");
    }

    public static void main(String[] args) {
        NoAbstractMethod();
    }

}
