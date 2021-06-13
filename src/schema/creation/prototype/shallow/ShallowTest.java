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

        System.out.println("after change origin name, original object's name:" + pro.getName());
        System.out.println("after change origin name, cloned object's name:" + pro1.getName());
        System.out.println(pro + "\n" + pro1);
        System.out.println("clone()方法调用的是本地 native 方法,克隆之后对象内存地址都变了");
    }
}
