package schema.structure.facade;

/**
 * Author: zongfulin
 * Date: 2021/3/26
 * Time: 9:57 AM
 * Description:
 */
public class VrGame implements Game {
    @Override
    public void play() {
        System.out.println("玩VR游戏");
    }
}
