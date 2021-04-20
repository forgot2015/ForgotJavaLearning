package book.icourse.exercise4;

/**
 * 学生类
 */
public class Student extends Operator {
    public Student(int age, String name) {
        super(age, name);
    }

    @Override
    public void borrowBook(String name) {
        System.out.println(name + "借了" + NORMAL_BORROW_COUNT + "本书");
    }

    @Override
    public void returnBook(String name) {
        System.out.println(name + "还了" + NORMAL_BORROW_COUNT + "本书");
    }
}
