package schema.behavior.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: zongfulin
 * Date: 2021/3/29
 * Time: 1:48 PM
 * Description:    //快递容器类
 */
public class DeliveryAggregate implements Aggregate {
    private List<String> list = new ArrayList<>();

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public String get(int index) {
        return list.get(index);
    }

    @Override
    public void add(String str) {
        list.add(str);
    }

    @Override
    public void remove(String str) {
        list.remove(str);
    }

    @Override
    public Iterator iterator() {
        return new DeliveryIterator(this);
    }
}
