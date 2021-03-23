package schema.creation.singleton;

public class SimpleSington {
    public static  SimpleSington INSTANCE;

    private SimpleSington() {
        INSTANCE =this;
    }

    static {
        new SimpleSington();
    }
}
