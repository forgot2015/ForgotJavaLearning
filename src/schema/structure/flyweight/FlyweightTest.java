package schema.structure.flyweight;

/**
 * Author: zongfulin
 * Date: 2021/3/26
 * Time: 5:51 PM
 * Description:享元模式
 */
public class FlyweightTest {
    public static void main(String[] args) {
        BikeFactory bikeFactory = new BikeFactory();
        IBike ofo = bikeFactory.getBike("ofo");
        ofo.billing("ofo", 1);

        IBike mobike = bikeFactory.getBike("mobike");
        mobike.billing("mobike", 2);

        ofo.billing("ofo", 10);
    }
}
