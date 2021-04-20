package base.leak;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by forgot on 2017/7/6.
 * 堆溢出
 * OutOfMemoryError
 * 要在运行界面 - Edit Configurations - Modify options -  Add VM options - 输入 -Xmx1m -Xms1m，保存再运行即可
 * 这样当程序占用的内存超过限制时，就报报错 OutOfMemoryError
 */
public class HeapLeakTest {
    static class OOMObject {    }
    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<>();
        while(true) {
            list.add(new OOMObject());
            System.out.println("list.add(new OOMObject());");
        }
    }
}
