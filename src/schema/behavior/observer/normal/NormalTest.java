package schema.behavior.observer.normal;

/**
 * Created by forgot on 2017/6/17.
 */
public class NormalTest {
    public static void main(String[] args) {
        ConcreteSubject subject =new ConcreteSubject();
        Observer observer1 =new ConcreteObserver();
        Observer observer2 =new ConcreteObserver();
        Observer observer3 =new ConcreteObserver();
        subject.attach(observer1);
        subject.attach(observer2);
        subject.attach(observer3);

        subject.setSubjectState("上班了");
    }
}
