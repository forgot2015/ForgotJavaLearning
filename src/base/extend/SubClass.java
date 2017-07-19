package base.extend;

/**
 * Created by forgot on 2017/7/19.
 */
public class SubClass extends FatherClass {
    public static void main(String[] args) {

    }

    void init(){
        //父类定义过的，在子类可以直接使用 而不用声明
        i=3;
    }
}
