package schema.behavior.observer.normal;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by forgot on 2017/6/15.
 */
public class ConcreteSubject implements Subject {
    private List<Observer> observerList = new ArrayList<>();

    private String subjectState;

    @Override
    public String getSubjectState() {
        return subjectState;
    }

    @Override
    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
        notifyAllObserver();
    }

    @Override
    public void attach(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyAllObserver() {
        for (Observer o : observerList) {
            o.update(this);
        }
    }
}
