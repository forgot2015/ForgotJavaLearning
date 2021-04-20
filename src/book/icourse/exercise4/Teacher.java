package book.icourse.exercise4;

/**
 * 教师类
 */
public class Teacher extends Operator {
    public Teacher(int age, String name) {
        super(age, name);
    }

    @Override
    public void borrowBook(String name) {
        System.out.println(name + "借了" + MORE_BORROW_COUNT + "本书");
    }

    @Override
    public void returnBook(String name) {
        System.out.println(name + "还了" + MORE_BORROW_COUNT + "本书");
    }
}
