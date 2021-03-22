package schema.behavior.observer.base;

/**
 * Created by forgot on 2017/6/15.
 * 抽象主题
 * 包含绑定和移除观察者方法
 * 包含通知所有观察者的方法
 */
public interface Subject {
    void attach(Observer observer);

    void detach(Observer observer);

    void notifyAllObserver(String string);
}
