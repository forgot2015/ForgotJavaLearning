package common.exception;

/**
 * Created by forgot on 2017/1/8.
 * 直接用exception5()方法 throw一个异常，此时在main函数也要用throws抛出异常，否则会报错
 */
public class ExceptionTest2 {
    public static void main(String[] args) throws Exception {
        exception();
        System.out.println("这里不会再执行，因为程序已经发生异常了");
    }

    private static void exception() throws Exception {
        System.out.println("exception 准备抛出异常");
    /*当屏蔽下面两句，就不会抛出异常了*/
        throw new Exception();
//        InputStream inputStream = new FileInputStream("text.txt");
    }
}
