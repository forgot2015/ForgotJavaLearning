package common.modifier;

/**
 * Created by forgot on 2017/1/8.
 */
public class AbstractClassTest {
    public static void main(String[] args) {
        AbstractClass.NoAbstractMethod();
        /*抽象类无法实例化*/
//        AbstractClass abstractClass = new AbstractClass();
        /*但可以直接用匿名内部类的方法来实现*/
        AbstractClass abstractClass = new AbstractClass() {
            @Override
            public void AbstractMethod2() {
                System.out.println("这是一个匿名内部类");
            }
            @Override
            void AbstractMethod3() {

            }
        };
        abstractClass.AbstractMethod2();
    }

}
