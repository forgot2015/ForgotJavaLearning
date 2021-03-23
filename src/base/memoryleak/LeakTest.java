package base.memoryleak;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by forgot on 2017/7/6.
 * 堆溢出
 */
public class LeakTest {
    static class OOMObject {    }
    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<>();
        while(true) {
            list.add(new OOMObject());
            System.out.println("list.add(new OOMObject());");
        }
    }
}
