package schema.structure.flyweight;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

/**
 * Author: zongfulin
 * Date: 2021/3/26
 * Time: 5:51 PM
 * Description:享元模式
 * 面向对象技术可以很好的解决一些灵活性或可扩展性问题，但在很多情况下需要在系统中增加类和对象的个数。当对象数量太多时，
 * 将导致对象创建及垃圾回收的代价过高，造成性能下降等问题。享元模式通过共享相同或者相似的细粒度对象解决了这一类问题。
 */
public class FlyweightTest {
    private static final Logger logger = LoggerFactory.getLogger(FlyweightTest.class);
    public static void main(String[] args) {
        logger.error("name = {}, outerState = {}", "main", "externalState");

        BikeFactory bikeFactory = new BikeFactory();
        IBike ofo = bikeFactory.getBike("ofo");
        ofo.billing("ofo", 1);

        IBike mobike = bikeFactory.getBike("mobike");
        mobike.billing("mobike", 2);

        ofo.billing("ofo", 10);
    }
}
