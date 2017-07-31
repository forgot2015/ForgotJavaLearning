package base;

/**
 * Created by forgot on 2017/7/29.
 */
public abstract class AbstractSample {
    public AbstractSample(){
        System.out.println("print AbstractSample");
    }

    public static void main(String[] args) {
        AbstractSample abstractSample =new AbstractSample() {
        };
    }
}
