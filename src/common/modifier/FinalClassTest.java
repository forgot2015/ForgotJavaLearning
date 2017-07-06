package common.modifier;

/**
 * Created by forgot on 2017/1/8.
 */
public class FinalClassTest {
    public static void main(String[] args) {

        System.out.println(FinalClass.MY_FINAL_STRING);
        /*此处调用的实际是FinalClass的finalMethod1()*/
        FinalClass2.finalMethod1();
        /*此处调用的是FinalClass2的finalMethod1()*/
        FinalClass2.finalMethod1("，随不能重写，但可以重载");

        /*static方法可以直接调用，不用new一个对象*/
        FinalClass3.FinalClass3Static.final3Method();
        /*当然，你硬要new一个对象也没问题*/
//        FinalClass3.FinalClass3Static finalClass3Static =new FinalClass3.FinalClass3Static();
//        finalClass3Static.final3Method();
        /*无法给final变量再赋值*/
//        FinalClass.MY_FINAL_STRING="ttt";

        FinalClass4 finalClass4 = new FinalClass4();
        finalClass4.finalMethod();
    }
}
