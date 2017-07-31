package schema.behavior.observer.normal;

/**
 * Created by forgot on 2017/6/15.
 * 抽象观察者，包含更新方法
 */
public interface Observer {
    void update(Subject subject);
}
