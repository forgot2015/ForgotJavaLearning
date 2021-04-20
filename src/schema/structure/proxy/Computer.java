package schema.structure.proxy;

import sun.nio.ch.Net;

/**
 * Author: zongfulin
 * Date: 2021/3/26
 * Time: 3:49 PM
 * Description:
 */
public class Computer implements Network {
    @Override
    public void surfing() {
        System.out.println("通过代理来网上冲浪");
    }
}
