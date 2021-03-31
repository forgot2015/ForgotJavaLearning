package base.sample;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by forgot on 2017/6/27.
 * 内存溢出，也就是堆溢出，当不断new对象时，内存占用会不断增加，内存泄漏太多，而GC来不及回收， 导致内存溢出，
 */
public class OutOfMemoryTest {
    static class OOMObject {}

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<OOMObject>();

        while (true) {
            list.add(new OOMObject());
        }
    }
}
