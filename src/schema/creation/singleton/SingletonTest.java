package schema.creation.singleton;


/**
 * Created by forgot on 2017/6/12.
 */
public class SingletonTest {
    public static void main(String[] args) {
        HungrySingleton singleton1 = HungrySingleton.getInstance();
        HungrySingleton singleton2 = HungrySingleton.getInstance();
        System.out.println(singleton1);
        System.out.println(singleton2);

        DoubleLockSingleton doubleLockSingleton1 = DoubleLockSingleton.getInstance();
        DoubleLockSingleton doubleLockSingleton2 = DoubleLockSingleton.getInstance();
        System.out.println(doubleLockSingleton1);
        System.out.println(doubleLockSingleton2);

        InnerClassSingleton innerClassSingleton1 = InnerClassSingleton.getInstance();
        InnerClassSingleton innerClassSingleton2 = InnerClassSingleton.getInstance();
        System.out.println(innerClassSingleton1);
        System.out.println(innerClassSingleton2);
    }
}
