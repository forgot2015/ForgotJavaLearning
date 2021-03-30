package schema.behavior.template;

/**
 * Author: zongfulin
 * Date: 2021/3/29
 * Time: 4:19 PM
 * Description:
 */
public class PostA extends PostTemplate{
    @Override
    protected void call() {
        System.out.println("联系学生 A 来操场");
    }
}
