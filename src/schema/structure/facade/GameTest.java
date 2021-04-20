package schema.structure.facade;

/**
 * Author: zongfulin
 * Date: 2021/3/26
 * Time: 10:00 AM
 * Description:外观模式
 * 外观模式隐藏系统的复杂性，并向客户端提供了一个客户端可以访问系统的接口。这种类型的设计模式属于结构型模式，它向现有的系统添加一个接口，
 * 来隐藏系统的复杂性。
 * 缺点:不符合开闭原则，不易更改。
 */
public class GameTest {
    public static void main(String[] args) {
        GameClient client = new GameClient();
        client.playPcGame();
        client.takeARest();
        client.playSwitchGame();
        client.takeARest();
        client.playVrGame();
        client.eat();
    }
}
