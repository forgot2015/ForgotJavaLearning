package schema.structure.facade;

/**
 * Author: zongfulin
 * Date: 2021/3/26
 * Time: 9:57 AM
 * Description:
 */
public class PcGame implements Game {
    @Override
    public void play() {
        System.out.println("玩电脑游戏");
    }
}
