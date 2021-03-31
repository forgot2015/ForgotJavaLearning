package base.memoryleak;

/**
 * StackOverflowError
 * 栈溢出
 */
public class StackOverFlowTest {
    public static void main(String[] args) {
        loop();
    }

    static void loop(){
        loop();
    }

}
