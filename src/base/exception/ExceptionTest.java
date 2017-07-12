package base.exception;

import java.io.*;

/**
 * Created by forgot on 2017/1/8.
 * 直接用throws抛出异常，不处理，遇到异常 程序就会奔溃
 */
public class ExceptionTest {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("准备抛出异常");
        InputStream inputStream = new FileInputStream("text.txt");
        System.out.println("这里不会再执行，因为程序已经发生异常了");
    }

}
