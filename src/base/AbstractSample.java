package base;

/**
 * Created by forgot on 2017/7/29.
 */
public abstract class AbstractSample {
    //    本抽象类的构造函数
    public AbstractSample() {
        System.out.println("print AbstractSample");
    }

    abstract void aTest();

    public static void main(String[] args) {
        AbstractSample abstractSample = new AbstractSample() {
            @Override
            void aTest() {

            }
        };
    }
}
