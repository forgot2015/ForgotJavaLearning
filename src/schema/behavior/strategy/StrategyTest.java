package schema.behavior.strategy;

/**
 * Author: zongfulin
 * Date: 2021/3/29
 * Time: 10:36 AM
 * Description:策略模式
 * <p>
 * 1.定义
 * 定义一系列的算法，把每一个算法封装起来,并且使它们可相互替换。策略模式模式使得算法可独立于使用它的客户而独立变化。
 * <p>
 * 2.介绍
 * 策略模式属于行为型模式。
 * 策略模式提供了一组算法给客户端调用，使得客户端能够根据不同的条件来选择不同的策略来解决不同的问题。
 * 如排序算法，可以使用冒泡排序、快速排序等等。
 */
public class StrategyTest {
    public static void main(String[] args) {
        System.out.println("遇到爱吃的女生");
        StrategyContext context = new StrategyContext(new EatingStrategy());
        context.chase();

        System.out.println("遇到爱看电影的女生");
        context = new StrategyContext(new MoviesStrategy());
        context.chase();

        System.out.println("遇到爱购物的女生");
        context = new StrategyContext(new ShoppingStrategy());
        context.chase();
    }
}
