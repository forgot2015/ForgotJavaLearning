import java.util.*;

public class Main {
    static Stack<Integer> stack1 = new Stack<Integer>();
    private static String str;

    public static void main(String[] args) {
//        System.out.println("Hello World!");
//        stack1.push(1);
//        stack1.push(2);
//        stack1.push(3);
//        System.out.println(stack1.pop());
//        //只查询，不出栈
//        System.out.println(stack1.peek());
//        System.out.println(stack1.pop());
//
//        String langbiRechargeURL = "http://test-cpay.ddwvending.com/home/langbirecharge?ms=%s&os=%s&mt=%s&ui=%s&la=%s&ra=%s";
//        String s = String.format(langbiRechargeURL, "11", "22", "33", "11", "22", "33");
//        System.out.println(s);
//        System.out.println(getTime());


//        String s = "2017-08-18T00:00:00";
//        SimpleDateFormat sf=new SimpleDateFormat("yyyy/MM/dd");
//        System.out.println(sf.format(s));
//        Date d = null;
//        try {
//            d = DateFormat.getDateTimeInstance().parse("2017-08-18T00:00:00");
////            d = DateFormat.getDateTimeInstance().parse("2009-08-08 20:08:08");
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
        //参数为符合日期规则的字符串
//        System.out.println(d.getDate());
//        String s = "2017-08-18T00:00:00";
//        System.out.println(s.substring(0,10));
//        double price = 0.00001;
//        DecimalFormat    df   = new DecimalFormat("######0.00");
//        df.format(price);
//        System.out.println(price);
//        DecimalFormat    df   = new DecimalFormat(".##");
//

//        System.out.println(stringForTime(1234));
//        System.out.println(stringForTime(14));

//
//        List<Integer> integerList = new ArrayList<>();
//
//        addItem(integerList, 1);
//        addItem(integerList, 1);
//        addItem(integerList, 1);
//        addItem(integerList, 3);
//        System.out.println(integerList);

//        System.out.println(System.currentTimeMillis());
//        System.out.println(str);

        List<String> testList = new ArrayList<>(10);
        testList.add(2,"2str");
        testList.add(5,"2str");
        testList.add(7,"2str");
        System.out.println(Arrays.toString(testList.toArray()));
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
