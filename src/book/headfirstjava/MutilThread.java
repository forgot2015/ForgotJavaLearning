package book.headfirstjava;

/**
 * Created by forgot on 2017/6/27.
 * 启动线程要用 start()方法,而不能用 run()
 */
public class MutilThread {
    public static void main(String[] args) {
        myThread.run();//并不会开启子线程，而还是处于main线程
        System.out.println("-----------");
        myThread.start();//会调用新的子线程.
        System.out.println("main," + Thread.currentThread());
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("curThread, " + Thread.currentThread());
            }
        }).start();
    }

    static Thread myThread = new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println("start run");
            System.out.println("curThread" + Thread.currentThread());
            doNext("do next");
        }

        void doNext(String s) {
            System.out.println(s);
            System.out.println("curThread" + Thread.currentThread());
        }
    });
}
