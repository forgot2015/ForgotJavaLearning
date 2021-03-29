package schema.behavior.strategy;

/**
 * Author: zongfulin
 * Date: 2021/3/29
 * Time: 3:47 PM
 * Description:
 */
public class MoviesStrategy implements ChaseStrategy {
    @Override
    public void chase() {
        System.out.println("通过看电影策略追女生");
    }
}
