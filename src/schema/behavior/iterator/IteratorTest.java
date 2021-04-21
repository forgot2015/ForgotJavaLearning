package schema.behavior.iterator;

/**
 * Author: zongfulin
 * Date: 2021/3/24
 * Time: 9:52 AM
 * Description:迭代器模式
 * 提供一种方法访问一个容器对象中各个元素，而又不需暴露该对象的内部细节。
 * <p>
 * 实际我们开发中很少使用到迭代器模式。虽然不怎么用得到，但是了解其原理能够让我们在看到相关的源码（如Java中的Map、List等等容器）
 * 时能够更容易了解源码的相关思想
 */
public class IteratorTest {
    public static void main(String[] args) {
        Aggregate aggregate = new DeliveryAggregate();
        aggregate.add("1111");
        aggregate.add("2222");
        aggregate.add("3333");
        aggregate.add("9527");

        Iterator iterator = aggregate.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("后面没有了");
    }
}
