package other;
import java.io.PrintStream;

import static  java.lang.System.out;

/**
 * Created by forgot on 5/26/2017.
 * 死锁的例子
 */
public class DeadLock {
    public static void main(String[] args) {
        Object res1 = "resource1";
        Object res2 = "resource2";
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (res1) {
                    System.out.println("thread1 lock res1");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (res2) {
                        while (true){
                            System.out.println("thread1 lock res2");
                            try {
                                Thread.sleep(5000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }

                    }

                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
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
            }
        });

        thread1.start();
        thread2.start();
    }
}
