/**
 * Created by forgot on 2017/6/27.
 * StackOverflowError 栈溢出
 */
public class StackOverFlowTest {
    public static void main(String[] args) {
        method();
    }

   static void method(){
        method();
    }

}
