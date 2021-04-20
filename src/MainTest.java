import java.util.concurrent.*;

/**
 * Author: zongfulin
 * Date: 2021/4/2
 * Time: 11:04
 * Description:
 */
public class MainTest {
    //    private static ExecutorService executor = Executors.newFixedThreadPool(15);
    private static ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 100, 0, TimeUnit.SECONDS, new ArrayBlockingQueue<>(1));

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            executor.execute(new SubThread());
        }
    }

    static class SubThread implements Runnable {
        @Override
        public void run() {
            try {
                Thread.sleep(1000);
                System.out.println("SubThread");
            } catch (InterruptedException e) {
                //do nothing
                System.out.println(e.getMessage());
            }
        }
    }
}
