package schema.creation.prototype.deep;

/**
 * Author: zongfulin
 * Date: 2021/3/30
 * Time: 2:51 PM
 * Description:深克隆,将对象里包含的其他引用变量也克隆
 */
public class DeepTest {
    public static void main(String[] args) {
        Student student = new Student("forgot", 18, new Address("hangzhou"));
        Student student1 = student.clone();
        System.out.println(student);
        System.out.println(student1);
        System.out.println("-----改变属性-----");
        student.getAddress().setAddr("guangzhou");
        student.setName("new forgot");
        student.setAge(28);
        System.out.println(student.toString());
        System.out.println(student1.toString());

        System.out.println("------------------");
    }
}
