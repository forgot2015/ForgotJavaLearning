package schema.behavior.iterator;

/**
 * Author: zongfulin
 * Date: 2021/3/29
 * Time: 1:45 PM
 * Description://快递迭代类
 */
public class DeliveryIterator implements Iterator {
    private Aggregate aggregate;
    private int index;

    public DeliveryIterator(Aggregate aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public boolean hasNext() {
        if (index < aggregate.size()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object next() {
        return aggregate.get(index++);
    }
}
