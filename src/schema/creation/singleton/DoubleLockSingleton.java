package schema.creation.singleton;

/**
 * Created by forgot on 2017/6/12.
 * 双重锁的单例模式，线程安全， 调用getInstance时才会生成
 * 静态方法是可以不用new一个对象 就能直接调用，而并不会说会自动调用。
 * 还是要手动去调用的，比如DoubleLockSingleton.getInstance();
 * 会自动调用的是静态代码块（+静态变量赋值）， new对象时的构造函数，普通代码块，
 *  //调用getInstance时才会生成
 */
public class DoubleLockSingleton {
    private static volatile DoubleLockSingleton instance;

    private DoubleLockSingleton() {
    }

    public static DoubleLockSingleton getInstance() {
        if (null == instance) {
            synchronized (DoubleLockSingleton.class) {
                if (null == instance) {
                    instance = new DoubleLockSingleton();
                }
            }
        }
        return instance;
    }

}
