package schema.structure.proxy;


/**
 * Author: zongfulin
 * Date: 2021/3/26
 * Time: 3:49 PM
 * Description:
 */
public class Computer implements Network {
    @Override
    public void surfing() {
        System.out.println("通过电脑代理来网上冲浪");
    }
}
