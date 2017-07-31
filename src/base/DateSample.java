package base;

import java.util.Date;

/**
 * Created by forgot on 2017/7/26.
 */
public class DateSample {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        System.out.println(new Date());
        System.out.println(new Date(System.currentTimeMillis()));

        System.out.println(System.currentTimeMillis()/1000);
    }
}
