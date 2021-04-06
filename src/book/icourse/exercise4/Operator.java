package study.icourse.exercise4;

/**
 * 借阅活动操作者
 */
public abstract class Operator extends Person implements Borrow, Return {
    public static final int NORMAL_BORROW_COUNT = 5;
    public static final int MORE_BORROW_COUNT = 10;

    public Operator(int age, String name) {
        super(age, name);
    }
}
