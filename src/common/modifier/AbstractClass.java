package common.modifier;

/**
 * Created by forgot on 2017/1/8.
 */

public abstract class AbstractClass {
    public  String string="name";
    /*抽象类下可以有非抽象方法*/
    public static final void NoAbstractMethod() {
        System.out.println("这是NoAbstractMethod下的AbstractMethod()方法");
    }
    /*抽象方法不能再用final来修饰，因为抽象方法只有继承了它的子类才能调用,并且不能有方法体*/
    /*抽象类只能有方法声明，不能包含方法体*/
//    public abstract void AbstractMethod(){
//        System.out.println("这是一个抽象方法");
//    }
    public abstract void AbstractMethod2();
    abstract void AbstractMethod3();
}