package four;


/**
 * Created by forgot on 2017/6/25.
 */
public class FourTest {
    public static void main(String[] args) {
        stringTest(new String[]{"name", "dog", "what"});
        System.out.println(calcArea(100000000,100000000));
    }

    static void stringTest(Object... args) {
        for (Object s : args) {
            System.out.println(s.toString());
        }
    }

   static  int calcArea(int height,int width){
        return  height*width;
    }

}
