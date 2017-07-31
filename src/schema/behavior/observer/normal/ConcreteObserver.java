package schema.behavior.observer.normal;

/**
 * Created by forgot on 2017/6/15.
 */
public class ConcreteObserver implements Observer {

    @Override
    public void update(Subject subject) {
        System.out.println("收到新通知:" + subject.getSubjectState());
    }
}
