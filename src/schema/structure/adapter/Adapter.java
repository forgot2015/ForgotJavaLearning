package schema.structure.adapter;

/**
 * Created by forgot on 6/9/2017.
 * 实现适配的类，继承待适配的类，再实现要适配的接口
 */
public class Adapter extends Adaptee implements Target {

    public void targetMethod() {
        this.oldMethod();
        System.out.println("已经适配好了");
    }

}
