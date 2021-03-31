package schema.behavior.strategy;

/**
 * Author: zongfulin
 * Date: 2021/3/29
 * Time: 3:49 PM
 * Description:传入不同的策略实体,将调用相应的策略方法
 */
public class StrategyContext {
    private ChaseStrategy strategy;

    public StrategyContext(ChaseStrategy chaseStrategy) {
        this.strategy = chaseStrategy;
    }

    public void chase() {
        strategy.chase();
    }
}
