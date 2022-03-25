import java.util.*;

public class Main {
    static Stack<Integer> stack1 = new Stack<>();
    private static String str;
    static char a;

    public static void main(String[] args) {
//        String strs ="dsd";
////        strs[1] = "1";
//
//        System.out.println(strs.getClass().getClassLoader());
//
//        System.out.println(String.class.getClassLoader());
//        java.lang.String str = "123";
//        System.out.println(str.getClass().getClassLoader());

//        byte[] inst = new byte[]{(byte) 0x03, (byte) 0x03, (byte) 0xD1, (byte) 0x48, (byte) 0xFE, (byte) 0x4E, (byte) 0x98, (byte) 0x42, (byte) 0x00, (byte) 0xF0, (byte) 0x23, (byte) 0x83, (byte) 0x00, (byte) 0xF3, (byte) 0x2F, (byte) 0x81, (byte) 0xFC, (byte) 0x4F, (byte) 0xB0, (byte) 0xF5, (byte) 0x9D, (byte) 0x7F, (byte) 0x3B, (byte) 0x68, (byte) 0x00, (byte) 0xF0, (byte) 0x93, (byte) 0x83, (byte) 0x68, (byte) 0xDC, (byte) 0x4F, (byte) 0xF0, (byte) 0x01, (byte) 0x08, (byte) 0xFC, (byte) 0x28, (byte) 0x00, (byte) 0xF0, (byte) 0xFD, (byte) 0x82, (byte) 0x59, (byte) 0xDC, (byte) 0x4A, (byte) 0xF2, (byte) 0xD7, (byte) 0x3C, (byte) 0x01, (byte) 0xFB, (byte) 0x0C, (byte) 0xC2, (byte) 0x4F, (byte) 0xEA, (byte) 0x92, (byte) 0x5A, (byte) 0xF5, (byte) 0x4A, (byte) 0xF3, (byte) 0x4E, (byte) 0xA2, (byte) 0xFB, (byte) 0x01, (byte) 0xC2, (byte) 0x4F, (byte) 0xEA, (byte) 0x52, (byte) 0x12, (byte) 0x6F, (byte) 0xF0, (byte) 0x18, (byte) 0x0C, (byte) 0x02, (byte) 0xFB, (byte) 0x0C, (byte) 0xF2, (byte) 0x01, (byte) 0xEB, (byte) 0x82, (byte) 0x02, (byte) 0xDF, (byte) 0xF8, (byte) 0xC0, (byte) 0x93, (byte) 0x1F, (byte) 0xFA, (byte) 0x82, (byte) 0xFC, (byte) 0x4F, (byte) 0xF0, (byte) 0x00, (byte) 0x04, (byte) 0x20, (byte) 0x28, (byte) 0x00, (byte) 0xF0, (byte) 0x60, (byte) 0x82, (byte) 0x11, (byte) 0xDC, (byte) 0x02, (byte) 0x28, (byte) 0x00, (byte) 0xF0, (byte) 0x57, (byte) 0x81, (byte) 0x0D, (byte) 0x28, (byte) 0x00, (byte) 0xF0, (byte) 0x5D, (byte) 0x81, (byte) 0x0E, (byte) 0x28, (byte) 0x1C, (byte) 0xBF, (byte) 0x04, (byte) 0xB0, (byte) 0xBD, (byte) 0xE8, (byte) 0xF0, (byte) 0x87, (byte) 0xE6, (byte) 0x48, (byte) 0x01, (byte) 0x61, (byte) 0x41, (byte) 0x61, (byte) 0x81, (byte) 0x61, (byte) 0x43, (byte) 0xF0, (byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0xDE, (byte) 0x7F};
////
//        byte[] crcs = CrcUtils.getCrc16Byte(inst);
//        System.out.println(Arrays.toString(crcs));

//        String s = "03 03 D1 48 FE 4E 98 42 00 F0 23 83 00 F3 2F 81 FC 4F B0 F5 9D 7F 3B 68 00 F0 93 83 68 DC 4F F0 01 08 FC 28 00 F0 FD 82 59 DC 4A F2 D7 3C 01 FB 0C C2 4F EA 92 5A F5 4A F3 4E A2 FB 01 C2 4F EA 52 12 6F F0 18 0C 02 FB 0C F2 01 EB 82 02 DF F8 C0 93 1F FA 82 FC 4F F0 00 04 20 28 00 F0 60 82 11 DC 02 28 00 F0 57 81 0D 28 00 F0 5D 81 0E 28 1C BF 04 B0 BD E8 F0 87 E6 48 01 61 41 61 81 61 43 F0 01 00 00 DE 7F";
//        String[] insts = s.split(" ");
//        for (int i = 0,size = insts.length; i <size ; i++) {
//            System.out.print("(byte)0x"+insts[i]+",");
//        }


        System.out.println(a);
        System.out.println(new Date());
        boolean[] booleans = new boolean[0];
    }

    /**
     * @see MainTest
     * {@link MainTest}
     */
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
