package book.icourse.exercise6;

/**
 * 异常测试类
 */
public class ExceptionTest {
    public static void main(String[] args) {
        try {
            TestClass testClass = new TestClass();
            testClass.testException();
        } catch (MyException e) {
            e.printStackTrace();
            System.out.println(e.getData());
            System.out.println(e.getError());
        }
    }
}
