package schema.behavior.observer.base;

/**
 * Created by forgot on 2017/6/16.
 *
 */
public class ObserverTest {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        Observer observer1 = new ConcreteObserver();
        Observer observer2 = new ConcreteObserver();
        Observer observer3 = new ConcreteObserver();
        subject.attach(observer1);
        subject.attach(observer2);
        subject.attach(observer3);
        subject.notifyAllObserver("单身狗明天来加班");

        subject.detach(observer3);
        subject.notifyAllObserver("喜欢 996 的周末也来加班");
    }
}
