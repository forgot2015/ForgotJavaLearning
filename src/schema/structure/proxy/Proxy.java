package schema.structure.proxy;

/**
 * Author: zongfulin
 * Date: 2021/3/26
 * Time: 3:50 PM
 * Description:
 */
public class Proxy implements Network {
    private Computer computer;

    public Proxy(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void surfing() {
        computer.surfing();
    }
}
