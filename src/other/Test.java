package other;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by forgot on 6/10/2017.
 * 测试内存占用情况
 */
public class Test {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub


        System.gc();
        long total = Runtime.getRuntime().totalMemory(); // byte
        long m1 = Runtime.getRuntime().freeMemory();
        System.out.println("before:" + (total - m1));

        Map<Object, Object> map = new HashMap<>();
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 1000; j++) {
                map.put(new Object(), new Object());
            }

        }
        long total1 = Runtime.getRuntime().totalMemory();
        long m2 = Runtime.getRuntime().freeMemory();
        System.out.println("after:" + (total1 - m2));
//        System.out.println(map.toString());
        long l = ((total1 - m2) - (total - m1)) / (1024 * 1024);
        System.out.println(l + "MB");
        String methodName =Thread.currentThread().getStackTrace()[1].getMethodName();
        System.out.println(methodName);
        testMethod();


        System.out.println(0xFF);
        System.out.println((byte)0xff);
    }


    private static void testMethod() {
        //输出正在调用的方法名
        String methodName =Thread.currentThread().getStackTrace()[1].getMethodName();
        System.out.println(methodName);
    }
}
