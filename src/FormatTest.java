import java.util.Calendar;
import java.util.Date;
import static java.lang.System.out;
/**
 * Created by forgot on 2017/6/26.
 */
public class FormatTest {
    public static void main(String[] args) {
        System.out.println(String.format("%tc",new Date()));
        System.out.println(new Date());
        System.out.println(String.format("%tr",new Date()));
        Date today = new Date();
        System.out.println(String.format("%tA,%tB %td",today,today,today));

        Calendar calendar =Calendar.getInstance();
        System.out.println(calendar);
        calendar.set(2016,3,2,15,30);
        out.println(calendar.getTime());
    }
}
