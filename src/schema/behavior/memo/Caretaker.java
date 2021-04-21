package schema.behavior.memo;

/**
 * Author: zongfulin
 * Date: 2021/3/29
 * Time: 2:31 PM
 * Description:备忘录管理类
 */
public class Caretaker {
    private Memento mMemento;

    public void setMemento(Memento memento) {
        mMemento = memento;
    }

    public Memento getMemento() {
        return mMemento;
    }
}