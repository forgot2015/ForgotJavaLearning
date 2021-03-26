package schema.structure.bridge;

/**
 * Author: zongfulin
 * Date: 2021/3/26
 * Time: 5:08 PM
 * Description:
 */
public class Student extends Person {
    @Override
    protected void dress() {
        System.out.println("学生穿 " + clothes.getName());
    }
}
