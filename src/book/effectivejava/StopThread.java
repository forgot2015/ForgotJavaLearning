package book.effectivejava;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by forgot on 2017/6/30.
 * 停止一个线程的推荐写法
 */
public class StopThread {
    private static volatile boolean stopRequested;

    public static final AtomicLong nextSerialNum = new AtomicLong();

    public static long generateSerialNumber() {
        return nextSerialNum.getAndIncrement();
    }

    public static void main(String[] args) {
        Thread backgroundThread = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (!stopRequested) {
                    i++;
                    System.out.println(i);
                }
            }
        });
        backgroundThread.start();
        try {
            TimeUnit.SECONDS.sleep(1);
//            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        stopRequested = true;
    }
}
