package headfirstjava.nine;

/**
 * Created by forgot on 2017/6/26.
 */
public class NineTest {

    public static void main(String[] args) {
        Object o = new Dog();
        //0无法引用Object中没有的方法
//        o.setName
        System.out.println(o.hashCode());
    }


}

class Dog {
    String name;

    void setName(String name) {
        this.name = name;
    }
}