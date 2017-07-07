package sample;

/**
 * Created by forgot on 2017/7/8.
 */
public class EnumSample {
    //普通的静态常量枚举模式
    public static final int APPLE_FUJI = 0;
    public static final int APPLE_PIPPIN = 1;
    public static final int APPLE_GTANNY = 2;

    public static final int ORANGE_NEVEL = 0;
    public static final int ORANGE_TEMPLE = 1;
    public static final int ORANGE_BLOOD = 2;


    //JDK1.5之后支持的enum枚举模式,优势在于打印时看到的是条目的名字，而不是一个int常量
    public enum Apple {
        FUJI, PIPPIN, GRANNY
    }

    public enum Orange {NAVEL, TEMPLE, BLOOD}

    public static void main(String[] args) {
        System.out.println(APPLE_FUJI);
        System.out.println(Apple.FUJI);
        getFruit(Apple.FUJI);
    }

    //switch中也支持enum
    public static void getFruit(Apple apple){
        switch (apple){
            case FUJI:
                System.out.println("you choose FUJI");break;
            case GRANNY:System.out.println("you choose FUJI");break;
            case PIPPIN:System.out.println("you choose FUJI");break;
        }
    }
}
