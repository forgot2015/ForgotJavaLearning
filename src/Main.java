import java.util.*;

public class Main {
    static Stack<Integer> stack1 = new Stack<>();
    private static String str;

    public static void main(String[] args) {
        String strs ="dsd";
//        strs[1] = "1";

        System.out.println(strs.getClass().getClassLoader());

        System.out.println(String.class.getClassLoader());
        java.lang.String str = "123";
        System.out.println(str.getClass().getClassLoader());
    }

    private static void addItem(List list, Integer i) {
        if (!list.contains(i)) {
            list.add(i);
        }
    }

    //这里方法名重复了，不是方法重载了，因为泛型List<String>和List<Integer>在编译时会擦除，统一变成了List，即参数类型完全一致，不是方法重载
//    public static String method(List<String> list) {
//        System.out.println("invoke method(List<String> list)");
//        return "";
//    }
//
//    public static int method(List<Integer> list) {
//        System.out.println("invoke method(List<Integer> list)");
//        return 1;
//    }

    /**
     * 获取当前时间，精确到秒，个位数则十位补零
     *
     * @return 如 20170818130204
     */
    public static String getTime() {
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int day = c.get(Calendar.DAY_OF_MONTH);
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);
        int second = c.get(Calendar.SECOND);
        String strMonth = String.format("%02d", month);
        String strDay = String.format("%02d", day);
        String strHour = String.format("%02d", hour);
        String strMinute = String.format("%02d", minute);
        String strSecond = String.format("%02d", second);
        return year + strMonth + strDay + strHour + strMinute + strSecond;
    }

    /**
     * long类型秒 转化为时分秒显示
     * 如1234秒表示为 20:34
     *
     * @param longSecond
     * @return
     */
    public static String stringForTime(long longSecond) {
        StringBuilder mFormatBuilder;
        Formatter mFormatter;
        mFormatBuilder = new StringBuilder();
        mFormatter = new Formatter(mFormatBuilder, Locale.getDefault());
        int totalSeconds = (int) longSecond;
        int seconds = totalSeconds % 60;
        int minutes = (totalSeconds / 60) % 60;
        int hours = totalSeconds / 3600;
        mFormatBuilder.setLength(0);
        if (hours > 0) {
            return mFormatter.format("%d:%02d:%02d", hours, minutes, seconds).toString();
        } else {
            return mFormatter.format("%02d:%02d", minutes, seconds).toString();
        }
    }
}
