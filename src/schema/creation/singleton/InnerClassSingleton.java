package schema.creation.singleton;

/**
 * Created by forgot on 2017/6/12.
 * 内部类单例模式，线程安全,调用getInstance时才会创建，更节省内存资源
 */
public class InnerClassSingleton {
    private InnerClassSingleton() {
    }

    public static InnerClassSingleton getInstance() {
        return InnerClass.instance;
    }

    private static class InnerClass {
        private static final InnerClassSingleton instance = new InnerClassSingleton();
    }

}
