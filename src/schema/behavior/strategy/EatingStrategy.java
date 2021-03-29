package schema.behavior.strategy;

/**
 * Author: zongfulin
 * Date: 2021/3/29
 * Time: 3:48 PM
 * Description:
 */
public class EatingStrategy implements ChaseStrategy{
    @Override
    public void chase() {
        System.out.println("通过吃饭策略追女生");
    }
}
