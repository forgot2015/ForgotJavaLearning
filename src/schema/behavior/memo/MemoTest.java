package schema.behavior.memo;

/**
 * Author: zongfulin
 * Date: 2021/3/24
 * Time: 9:53 AM
 * Description:备忘录模式测试
 * 在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态，这样以后就可以将该对象恢复到先前保存的状态。
 * <p>
 * 备忘录模式比较适合用于功能复杂，但是需要维护和纪录历史的地方，或者是需要保存一个或者多个属性的地方；在未来某个时刻需要时，
 * 将其还原到原来纪录的状态。
 *
 * Android中的Activity就提供了状态保存机制来保证Activity在被系统回收后能够恢复当前Activity的数据。这一机制实际上就是onSaveInstanceState和onRestoreInstanceState。onSaveInstanceState就是用来保存当前Activity的状态，onRestoreInstanceState则是用来恢复Activity的状态。
 *
 *
 *
 * 作者：四月葡萄
 * 链接：https://www.jianshu.com/p/c8a63849d629
 * 来源：简书
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class MemoTest {
    public static void main(String[] args) {
        System.out.println("首次进入游戏");
        Game game = new Game();
        game.play();//玩游戏
        Memento memento = game.createMemento();//创建存档
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(memento);//保存存档
        game.exit();//退出游戏

        System.out.println("-------------");
        System.out.println("二次进入游戏");
        Game secondGame = new Game();
        secondGame.setMemento(caretaker.getMemento());//读取存档
        secondGame.play();//继续玩游戏
        secondGame.exit();//不存档,嘿嘿嘿
    }
}
