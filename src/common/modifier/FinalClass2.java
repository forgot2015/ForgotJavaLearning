package common.modifier;

/**
 * Created by forgot on 2017/1/8.
 */
public class FinalClass2 extends FinalClass {

    /*final方法只能在子类直接调用，而无法进行重写，想重写会报错*/
//    @Override
//    public final void finalMethod1() {
//        System.out.println("这是TestFinal2n下的finalMethod1()方法");
//    }

    /*随不能重写，但可以重载*/
    public static final void finalMethod1(String string){
        System.out.println("这是FinalClass2下的finalMethod1()方法"+string);
    }
}
