package schema.creation.prototype.deep;

/**
 * Created by forgot on 2017/6/19.
 * 原型模式主要用于对象的复制，它的核心是就是类图中的原型类Prototype。Prototype类需要具备以下两个条件：
 * <p>
 * 实现Cloneable接口。在java语言有一个Cloneable接口，它的作用只有一个，就是在运行时通知虚拟机可以安全地在实现了此接口的类上使用clone方法。
 * 在java虚拟机中，只有实现了这个接口的类才可以被拷贝，否则在运行时会抛出CloneNotSupportedException异常。
 * 重写Object类中的clone方法。Java中，所有类的父类都是Object类，Object类中有一个clone方法，作用是返回对象的一个拷贝，
 * 但是其作用域protected类型的，一般的类无法调用，因此，Prototype类需要将clone方法的作用域修改为public类型。
 * 原型模式是一种比较简单的模式，也非常容易理解，实现一个接口，重写一个方法即完成了原型模式。在实际应用中，原型模式很少单独出现。
 * 经常与其他模式混用，他的原型类Prototype也常用抽象类来替代。
 * <p>
 * 使用原型模式创建对象比直接new一个对象在性能上要好的多，因为Object类的clone方法是一个本地方法，它直接操作内存中的二进制流，
 * 特别是复制大对象时，性能的差别非常明显。
 * <p>
 * 深克隆
 */
public class DeepTest {
    public static void main(String[] args) {
//        Prototype prototype = new ConcretePrototype();
//        for (int i = 0; i < 10; i++) {
//            ConcretePrototype prototype1 = (ConcretePrototype) prototype.clone();
//            prototype1.show();
//        }

        Prototype pro = new Prototype();
        pro.setName("original object");
        Prototype pro1 = pro.clone();
        pro.setName("changed object1");

        System.out.println("original object:" + pro.getName());
        System.out.println("cloned object:" + pro1.getName());
    }
}