package schema.behavior.observer.base;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by forgot on 2017/6/15.
 */
public class ConcreteSubject implements Subject {
    private List<Observer> observerList = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        System.out.println("attach " + observer);
        observerList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        System.out.println("detach " + observer);
        observerList.remove(observer);
    }

    @Override
    public void notifyAllObserver(String string) {
        for (Observer o : observerList) {
            o.update(o + string);
        }
    }
}
