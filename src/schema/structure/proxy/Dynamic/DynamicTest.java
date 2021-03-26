package schema.structure.proxy.Dynamic;

import schema.structure.proxy.Computer;
import schema.structure.proxy.Network;

import java.lang.reflect.Proxy;

/**
 * Author: zongfulin
 * Date: 2021/3/26
 * Time: 4:16 PM
 * Description:动态代理
 */
public class DynamicTest {
    public static void main(String[] args) {
        Computer computer = new Computer();
        // 返回一个代理对象
        Network computerPetter = (Network) Proxy.newProxyInstance(
                computer.getClass().getClassLoader(),
                computer.getClass().getInterfaces(),
                new DynamicProxy(computer));
        computerPetter.surfing();
    }
}
