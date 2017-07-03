package sample;

/**
 * Created by forgot on 2017/7/3.
 */
public class StringSample {
    public static void main(String[] args){
        String string = "abcdefghijklmn";
        StringBuilder stringBuilder = new StringBuilder(string);
        string = string.substring(2,10);
        System.out.println(string);
        stringBuilder.substring(3,11);
        System.out.println(stringBuilder);
    }
}
