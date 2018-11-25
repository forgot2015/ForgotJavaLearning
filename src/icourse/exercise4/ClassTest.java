package icourse.exercise4;

/**
 * 测试类
 */
public class ClassTest {
    public static void main(String[] args) {
        Student student1= new Student(20,"学生1");
        Student student2= new Student(22,"学生2");
        Teacher teacherA = new Teacher(38,"老师A");
        Teacher teacherB = new Teacher(42,"老师B");

        student1.borrowBook(student1.getName());
        student2.borrowBook(student2.getName());
        student1.returnBook(student1.getName());
        student2.returnBook(student2.getName());

        teacherA.borrowBook(teacherA.getName());
        teacherB.returnBook(teacherB.getName());
    }

}
