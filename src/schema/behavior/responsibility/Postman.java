package schema.behavior.responsibility;

/**
 * Author: zongfulin
 * Date: 2021/3/29
 * Time: 2:50 PM
 * Description:
 */
public abstract class Postman {//快递员抽象类
    protected Postman nextPostman;//下一个快递员

    public abstract void handleCourier(String address);//派送快递
}
