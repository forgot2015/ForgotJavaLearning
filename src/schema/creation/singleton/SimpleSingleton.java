package schema.creation.singleton;

public class SimpleSingleton {
    public static SimpleSingleton INSTANCE;

    private SimpleSingleton() {
        INSTANCE = this;
    }

    static {
        new SimpleSingleton();
    }
}
