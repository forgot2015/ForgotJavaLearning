package schema.structure.proxy;

/**
 * Author: zongfulin
 * Date: 2021/3/26
 * Time: 3:48 PM
 * Description:代理模式,静态代理
 */
public class ProxyTest {
    public static void main(String[] args) {
        Proxy proxy = new Proxy(new Computer());
        proxy.surfing();
    }
}
