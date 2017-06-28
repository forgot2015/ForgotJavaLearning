package thread;

/**
 * Created by forgot on 2017/6/28.
 */
public class ThreadTest {
    private volatile Thread blinker;
    public static void main(String[] args) {

        public void stop() {
            blinker = null;
        }
        public void run() {
            Thread thisThread = Thread.currentThread();
            while (blinker == thisThread) {
                try {
                    thisThread.sleep(interval);
                } catch (InterruptedException e){
                }
                repaint();
            }
        }
    }
}
