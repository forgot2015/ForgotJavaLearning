package sample;

/**
 * Created by forgot on 2017/7/10.
 */
public class ByteSample3 {
    public static void main(String[] args) {
        String str="98 68 01 ff 00 01 04 00 00 10 00 FE\n";
        String[] strings = str.trim().split(" ");
        int i= Integer.parseInt(strings[7]+strings[8]+strings[9] + strings[10], 16);
        System.out.println(i);
    }
}
