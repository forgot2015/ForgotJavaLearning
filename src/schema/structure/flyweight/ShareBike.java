package schema.structure.flyweight;

/**
 * Author: zongfulin
 * Date: 2021/3/26
 * Time: 5:54 PM
 * Description:
 */
public class ShareBike implements IBike {
    private int price = 1;
    private int total;

    @Override
    public void billing(String name, int time) {
        total = price * time;

        System.out.println(name + " 共花费 " + total + "元");
    }
}
