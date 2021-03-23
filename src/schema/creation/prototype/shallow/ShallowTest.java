package schema.creation.prototype.shallow;

/**
 * Created by forgot on 2017/6/19.
 * 浅克隆
 */
public class ShallowTest {
    public static void main(String[] args) {
        Prototype pro = new Prototype();
        pro.setName("original object");
        Prototype pro1 = pro.clone();
        pro.setName("changed object1");

        System.out.println("original object:" + pro.getName());
        System.out.println("cloned object:" + pro1.getName());
    }
}
