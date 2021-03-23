package base.memoryleak;

/**
 * StackOverflowError
 * 栈溢出
 */
public class StackLeakTest {
    public static void main(String[] args) {
        loop();
    }

    static void loop(){
        loop();
    }

}
