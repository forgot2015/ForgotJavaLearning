package common.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by forgot on 2017/1/8.
 * 用try..catch来捕获并处理异常，main方法调用时不用throws异常
 */
public class ExceptionTest3 {
    public static void main(String[] args) {
        /*测试各方法实际效果，可以每次执行一个方法测试*/
        exception1();
//        exception2();
//        exception3();
        System.out.println("测试main,有异常也不怕");
    }

    /*用try...catch捕获异常，并直接抛出，程序会奔溃*/
    private static void exception1() {
        try {
            System.out.println("测试Exception1，发生在异常之前");
            InputStream inputStream = new FileInputStream("text.txt");
            System.out.println("测试Exception1,发生在异常之后,由于上面的句子发生异常了，所以这句不会执行，而直接跳到catch里面了");
        } catch (FileNotFoundException e) {
            /*这里已经捕获了异常，你可以用自定义方法来处理异常，也可以不处理，
            而将异常直接抛出，如果直接抛出，那么效果和在方法声明处 直接throws Exception是一样的*/
            System.out.println("测试Exception1，捕获异常，并直接抛出");
            e.printStackTrace();
        }
    }

    /*用try...catch捕获异常，进行异常处理，不抛出*/
    private static void exception2() {
        try {
            InputStream inputStream = new FileInputStream("text.txt");
        } catch (FileNotFoundException e) {
            System.out.println("测试Exception2，捕获到异常了，现在对它进行处理");
//            屏蔽下面这句，就不会抛出异常了
//            e.printStackTrace();
        }
    }

    /*多个catch语句， 还带着finally语句的情况，若提前运行了System.exit(0)，则finally不会执行*/
    private static void exception3() {
        try {
            InetAddress inet1 = InetAddress.getByName("wwwww.163.com");
            InputStream inputStream = new FileInputStream("text.txt");
            System.out.println(inet1);
        } catch (FileNotFoundException e) {
            System.out.println("测试Exception3，捕获到FileNotFoundException异常了，现在对它进行处理");
//            e.printStackTrace();
        } catch (UnknownHostException e) {
//            System.out.println("发现163访问失败的异常，但执行了 System.exit(0);程序终止了，也不会执行后面的语句，包括finally");
//            屏蔽这句System.exit(0); 程序才能继续运行下去
//            System.exit(0);//System.exit(0);为正常退出，非0则为不正常退出，如System.exit(1);
            System.out.println("exception3 准备抛出163访问失败的异常");
            e.printStackTrace();
        } finally {
            System.out.println("finally总会执行的，除非程序突然System.exit了");
        }
    }
}
