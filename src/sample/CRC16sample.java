package sample;

/**
 * Created by forgot on 2017/7/3.
 */
public class CRC16sample {
    public static void main(String[] args) {
        int crc = CRC16Util.calcCrc16(new byte[] {(byte) 0x98, (byte)0x68, (byte) 0xff, (byte)0x01, (byte)0x55, (byte)0x02, (byte)0x02, (byte)0x01, (byte)0x01, (byte) 0xFE});
//        System.out.println(crc);
        System.out.println(String.format("%04X", crc));
        String str = String.format("%04X", crc);
        String str1 = str.substring(0,2);
        String str2 = str.substring(2,4);
//        System.out.println(str1+":"+str2);
//        int i1 = Integer.toHexString(str1);
//        int i2 = Integer.parseInt(str2);
//        System.out.println(i1+":"+i2);
        byte a = (byte) (crc/256);
        byte b = (byte) (crc%256);
        System.out.println(a+":"+b);
//        int crc2 = CRC16Util.calcCrc16(new byte[] {(byte) 0x98, (byte)0x68, (byte) 0xff, (byte)0x01, (byte)0x55, (byte)0x02, (byte)0x02, (byte)0x02, (byte)0x01, (byte) 0xFE});
//        System.out.println(String.format("%04X", crc2));


    }


}
