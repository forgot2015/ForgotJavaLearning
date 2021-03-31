package other;

import java.io.PrintStream;

import static java.lang.System.out;

/**
 * Created by forgot on 5/26/2017.
 * 死锁的例子
 * 因在第二步互相要抢夺另外的资源时失败了,导致线程没法继续执行,造成了死锁
 */
public class DeadLock {
    public static void main(String[] args) {
        Object res1 = "resource1";
        Object res2 = "resource2";
        Thread thread1 = new Thread(() -> {
            synchronized (res1) {
                System.out.println("thread1 lock res1");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (res2) {
                    System.out.println("thread1 lock res2");
                }
            }
            out.println("thread1 finish");
        });
        Thread thread2 = new Thread(() -> {
            synchronized (res2) {
                System.out.println("thread2 lock res2");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (res1) {
                    System.out.println("thread2 lock res1");
                }
            }
            out.println("thread2 finish");
        });

        thread1.start();
        thread2.start();
    }
}
