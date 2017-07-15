package base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by forgot on 2017/7/14.
 * 输入输出流
 */
public class StreamSample {
    public static void main(String[] args) {
        char c;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter characters,'q' to quit");
        try {
            do {
                c = (char) bufferedReader.read();
//                System.out.println(c);
                if (c != 'q') {
                    System.out.print(c);
                }

            } while (c != 'q');
            System.out.println("end");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
