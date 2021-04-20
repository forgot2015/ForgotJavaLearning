package schema.structure.flyweight;

/**
 * Author: zongfulin
 * Date: 2021/3/26
 * Time: 5:51 PM
 * Description:
 */
interface IBike {
    /**
     * 支付账单
     *
     * @param name
     * @param time
     */
    void billing(String name, int time);
}
