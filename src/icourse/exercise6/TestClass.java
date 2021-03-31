package icourse.exercise6;

/**
 * 包含可能会抛出异常的方法的类
 */
public class TestClass {
    /**
     * 可能会抛出异常的方法
     */
    public void testException() {
        try {
            int i = 2 / 0;
        } catch (Exception e) {
            throw new MyException("test exception", "尝试抛出自定义异常");
        }
    }
}
