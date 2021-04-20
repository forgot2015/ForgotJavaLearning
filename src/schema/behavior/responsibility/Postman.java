package schema.behavior.responsibility;

/**
 * Author: zongfulin
 * Date: 2021/3/29
 * Time: 2:50 PM
 * Description:快递员抽象类
 */
public abstract class Postman {
    /**
     * 下一个快递员
     */
    protected Postman nextPostman;

    /**
     * 派送快递
     *
     * @param address
     */
    public abstract void handleCourier(String address);
}
