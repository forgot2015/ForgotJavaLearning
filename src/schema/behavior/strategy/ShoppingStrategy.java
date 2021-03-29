package schema.behavior.strategy;

/**
 * Author: zongfulin
 * Date: 2021/3/29
 * Time: 3:46 PM
 * Description:
 */
public class ShoppingStrategy implements ChaseStrategy{
    @Override
    public void chase() {
        System.out.println("通过购物策略追女生");
    }
}
