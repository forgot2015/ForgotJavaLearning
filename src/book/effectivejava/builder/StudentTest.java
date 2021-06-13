package book.effectivejava.builder;

/**
 * @author zongfulin
 * Date: 2021/4/24
 * Time: 10:29
 * Description:
 */
public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student.Builder().setName("forgot").setAge(18).build();
        System.err.println(student.toString());

        Student2 student2 = new Student2.Builder().setName("forgot2").setAge(20).build();
        System.err.println(student2.toString());
    }
}
