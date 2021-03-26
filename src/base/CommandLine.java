package base;

/**
 * Created by forgot on 2017/7/14.
 */
public class CommandLine {
    static int arr[] = new int[5];

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "]: " + args[i]);
        }
//        for ( int i=0; i<10; i++)
//            System.out.println(i);
//        for ( int i=0; i<10; i++){
//            System.out.println(i);
//        }
//        System.out.println(arr[0]);
//        一个计算银行年利率的demo
        double origin = 1;
        double after12 = Math.pow(1.004, 12);
        double sum = origin;
        for (int i = 0; i < 30; i++) {
            sum *= after12;
            System.out.println("year " + (i + 1) + ":" + sum);
        }
        System.out.println(after12);
        System.out.println(after12 * after12);
        System.out.println(after12 * after12 * after12);
    }


}
