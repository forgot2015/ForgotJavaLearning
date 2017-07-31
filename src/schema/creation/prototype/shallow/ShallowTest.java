package schema.creation.prototype.shallow;

/**
 * Created by forgot on 2017/6/19.
 */
public class ShallowTest {
    public static void main(String[] args) {
        Prototype pro = new Prototype();
        pro.setName("original object");
        Prototype pro1 = (Prototype)pro.clone();
        pro.setName("changed object1");

        System.out.println("original object:" + pro.getName());
        System.out.println("cloned object:" + pro1.getName());
    }
}
