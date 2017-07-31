package other.thread;

/**
 * Created by forgot on 2017/6/17.
 */
public class ThreadTest {
    public static void main(String[] args) {
        new MyThread().start();
    }

    static class MyThread extends Thread{
        @Override
        public void run() {
//            super.run();
            new Runnable(){
                @Override
                public void run() {
                    System.out.println("MyThread下的 run 下的Runnable 下的run");
                    new Runnable(){
                        @Override
                        public void run() {
                                
                        }
                    }.run();
                }
            }.run();
        }
    }
}
