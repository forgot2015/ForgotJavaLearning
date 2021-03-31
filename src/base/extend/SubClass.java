package base.extend;

/**
 * Created by forgot on 2017/7/19.
 */
public class SubClass extends FatherClass {

    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        subClass.printTest();
        subClass.init();
        subClass.printTest();
    }

    private void init() {
        //父类定义过的，在子类可以直接使用 而不用声明
        i = 3;
//        private 变量只有本类可以使用
//        j = 4;
    }

    private void printTest() {
        System.out.println("i=" + i);
    }
}
