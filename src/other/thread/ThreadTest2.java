package other.thread;

/**
 * Created by forgot on 2017/6/24.
 */
public class ThreadTest2 {

    public static void main(String[] args) {
//        new Thread1().start();
//        new Thread2().start();
        for (int i = 0; i < 3; i++) {
            new Thread1().start();
        }
    }

    static String string;

    public static class Thread1 extends Thread {
        @Override
        public void run() {
            string = "Thread1 start";
            synchronized (string) {
                System.out.println(string);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                string = "Thread1 end";
                System.out.println(string);
            }
//            synchronized (Thread1.class){
//                System.out.println(string);
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            string="Thread1 end";
//                System.out.println(string);
//            }

        }
    }

    public static class Thread2 extends Thread {
        @Override
        public void run() {
            System.out.println("Thread2 start");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread2 end");
        }
    }
}
