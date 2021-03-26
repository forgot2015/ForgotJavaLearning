package schema.structure.facade;

/**
 * Author: zongfulin
 * Date: 2021/3/26
 * Time: 9:59 AM
 * Description:
 */
public class GameClient {
    private PcGame pcGame;
    private SwitchGame switchGame;
    private VrGame vrGame;

    public GameClient() {
        pcGame = new PcGame();
        switchGame = new SwitchGame();
        vrGame = new VrGame();
    }

    public void playPcGame() {
        pcGame.play();
    }

    public void playSwitchGame() {
        switchGame.play();
    }

    public void playVrGame() {
        vrGame.play();
    }

    public void takeARest() {
        System.out.println("玩累了休息一会儿");
    }

    public void eat() {
        System.out.println("玩饿了去吃饭");
    }
}
