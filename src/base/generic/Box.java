package base.generic;

/**
 * Created by forgot on 2017/7/15.
 * java 泛型
 */
public class Box<T> {
    private T box;

    public void add(T box) {
        this.box = box;
    }

    public T get() {
        return box;
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        Box<String> stringBox = new Box<>();

        integerBox.add(new Integer(10));
        stringBox.add(new String("Hello World"));

        System.out.printf("Integer Value :%d\n\n", integerBox.get());
        System.out.printf("String Value :%s\n", stringBox.get());
    }
}
