package base.modifier;

/**
 * Created by forgot on 2017/1/8.
 */
public class SyncTest implements Runnable {
    public void run() {
        /*若此放去去掉synchronized(this)，则两线程的运行顺序无法确定*/
        synchronized(this) {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " synchronized loop " + i);
            }
        }
    }
    public static void main(String[] args) {
        SyncTest t1 = new SyncTest();
        Thread ta = new Thread(t1, "A");
        Thread tb = new Thread(t1, "B");
        ta.start();
        tb.start();
    }
}
