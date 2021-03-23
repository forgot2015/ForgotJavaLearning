package base.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by forgot on 2017/7/15.
 */
public class GenericSample2 {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add(1.3);
        list.add('a');
        list.add(233);
        list.add(666);
        list.add("string");
        System.out.println(list);
    }

    public <T> void setValue(T value) {

    }
}
