package schema.behavior.observer.base;

/**
 * Created by forgot on 2017/6/15.
 */
public class ConcreteObserver implements Observer {

    @Override
    public void update(String string) {
        System.out.println("收到新通知:" + string);
    }
}
