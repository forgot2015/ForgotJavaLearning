package base.thread;

/**
 * Created by forgot on 2017/7/14.
 */
public class ThreadSample2 {
    private volatile boolean active;

    public static void main(String[] args) {
        ThreadSample2 threadSample2 = new ThreadSample2();
        threadSample2.myThread.start();
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        threadSample2.myStop();
    }

    Thread myThread = new Thread(new Runnable() {
        @Override
        public void run() {
            active = true;
            while (active) {
                int i = 1;
                System.out.println("myThread:" + ++i);
                for (int j = 0; j < 10; j++) {
                    System.out.println("j = " + j);
                }
            }
        }
    });

    //令线程停止的方法
    public void myStop() {
        active = false;
        System.out.println("线程停止");
    }

    public class MyRunnable implements Runnable {
        private volatile boolean active;

        public void run() {
            active = true;
            while (active) {
                // 代码
                int i = 1;
                System.out.println("MyRunnable:" + ++i);
            }
        }

        public void stop() {
            active = false;
        }
    }
}
