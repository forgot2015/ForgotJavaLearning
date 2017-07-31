package base;

/**
 * Created by forgot on 2017/7/27.
 */
public class BaseSample {
    private static Object myObj;

    public static void main(String[] args) {
        testSwitch(2);
        /*就像每种原始类型都有默认值一样，如int默认值为0，boolean的默认值为false，null是任何引用类型的默认值，不严格的说是所有object类型的默认值。就像你创建了一个布尔类型的变量，它将false作为自己的默认值，Java中的任何引用变量都将null作为默认值。*/
        System.out.println("What is value of myObjc : " + myObj);
//        System.out.println("What is value of myObjc : " + myObj.toString());

        Integer iAmNull = null;
        int i = iAmNull;
        System.out.println(i);
    }

    static void testSwitch(int i) {
        switch (i) {
            default:
                System.out.println("no one");
//                break;
            case 1:
                System.out.println(1);
                break;

        }
    }
}
