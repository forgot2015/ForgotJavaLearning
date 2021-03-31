package base.sample;

import java.util.Scanner;

/**
 * Created by forgot on 2017/7/3.
 */
public class ThreadRunningSample {
    public static void main(String[] args) {

        new Thread(new Runnable() {
            Scanner scanner = new Scanner(System.in);
            boolean keepRunning = true;
            @Override
            public void run() {
                while (keepRunning) {
                    String in = scanner.nextLine();
                    if (in == null) {
                        return;
                    }
                    System.out.println(in);

                    if (("stop").equals(in)) {
                        keepRunning = false;
                        return;
                    }
                    in = null;
                }
            }
        }).start();
    }
}
