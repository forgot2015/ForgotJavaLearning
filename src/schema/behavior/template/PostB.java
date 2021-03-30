package schema.behavior.template;

/**
 * Author: zongfulin
 * Date: 2021/3/29
 * Time: 4:20 PM
 * Description:
 */
public class PostB extends PostTemplate{
    @Override
    protected void call() {
        System.out.println("联系老师 A 来拿快递");
    }

    @Override
    protected boolean isSign() {
        return false;
    }

    @Override
    protected void refuse() {
        System.out.println("快递有问题,拒签");
    }
}
