package schema.structure.bridge;

/**
 * Author: zongfulin
 * Date: 2021/3/26
 * Time: 5:09 PM
 * Description:
 */
public class Coder extends Person {
    @Override
    protected void dress() {
        System.out.println("程序员穿 " + clothes.getName());
    }
}
