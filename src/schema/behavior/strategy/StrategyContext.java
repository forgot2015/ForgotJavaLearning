package schema.behavior.strategy;

/**
 * Author: zongfulin
 * Date: 2021/3/29
 * Time: 3:49 PM
 * Description:
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
