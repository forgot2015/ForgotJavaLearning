package schema.creation.singleton;

/**
 * Created by forgot on 2017/6/12.
 * 饿汉式单例模式，线程安全，类加载时就会创建,性能浪费
 */
public class HungrySingleton {
    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return instance;
    }

}
