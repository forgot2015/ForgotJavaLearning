package sample;

/**
 * Created by forgot on 2017/7/8.
 */
public class ByteSample2 {
    public static void main(String[] args) {
        byte b = (byte) 10101010;

//        String s = Integer.toString(b);
////        int[] ints = b
//        System.out.println(b);
//        System.out.println(s);
//        int i=0x1;
//        System.out.println(i&b);
//        i=i<<1;
//        System.out.println(i&b);
//        i=i<<1;
//        System.out.println(i&b);
//        i=i<<1;
//        System.out.println(i&b);
//        i=i<<1;
//        System.out.println(i&b);
//        String srt2=new String(b,"UTF-8");
//        System.out.println((byte)10101010);
//        int boxId = 20;
//
//        int sum = 0xe3 + 0x4f;
//
//        switch (sum) {
//            case 1:
//                System.out.println(sum+"open");
//                break;
//
//        }

        int boxId = 4;
        int curNum = 10;
        int boxState;
        //查询所有门开闭情况
        for (int i = 1; i <= boxId; i++) {
            boxState = 1 << i - 1 & curNum;
            if (boxState == 0) {
                System.out.println(i + "door lock");
            } else {
                System.out.println(i + "door open");
            }
        }
        //查询单个门开闭情况
        boxId = 10;
        boxState = 1 << boxId - 1 & curNum;
        if (boxState == 0) {
            System.out.println(boxId + "door lock");
        } else {
            System.out.println(boxId + "door open");
        }

//        int boxState = 1<<boxId-1 & curNum;
//        if (boxState==0){
//            System.out.println("door lock");
//        }else{
//            System.out.println("door open");
//        }
//        System.out.println(1<<boxId-1 & curNum);

    }

}
