package base.thread;

/**
 * Created by forgot on 2017/7/12.
 */
public class ThreadSample {
    public static void main(String[] args) {
        myThread1.start();
        myThread2.start();
    }

    static Thread myThread1 = new Thread(new Runnable() {
        @Override
        public void run() {
            for (int i = 0; i < 3; i++) {
                System.out.println("myThread1 " + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    });

    static Thread myThread2 = new Thread(new Runnable() {
        @Override
        public void run() {
            for (int i = 0; i < 3; i++) {
                System.out.println("myThread2 " + i);
            }
        }
    });


    public class MyThread extends Thread {
        @Override
        public void run() {
//           super.run();
            System.out.println();
        }
    }
}
