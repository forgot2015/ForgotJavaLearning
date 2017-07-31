package other.reflection;

/**
 * Created by forgot on 2017/6/14.
 */
public class Reflection1 {
    public static void main(String[] args) {
        int x =0;
switch (x){
    default:
        System.out.println("default");
    case 1:
        System.out.println(1);
    case 2:
        System.out.println(2);

}

    }
   void  testMethod(){
        Class<?> class1 = null;
        try {
            class1=Class.forName("net.xsoftlab.baike.User");
            System.out.println(class1);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
