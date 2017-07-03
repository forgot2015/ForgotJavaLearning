package sample;

import sun.misc.CRC16;

/**
 * Created by forgot on 2017/7/3.
 */
public class CRC16sample {
    public static void main(String[] args) {
        byte[] bytes = new byte[]{(byte) 0x98, (byte) 0x68, (byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0xFE};
        String s = getCrc(bytes);
        System.out.println(getCrc(bytes));
//        System.out.println(Crc16Calc(bytes,bytes.length));
//        String s = mkCrc16(bytes);
        System.out.println(s);
        int i =Integer.parseInt(s);
//        int  intBase10=Convert.ToInt32(strBase16,16);
//        System.out.println(evalCRC16(bytes));
//        System.out.println(getCRC(bytes));
        byte a = (byte) (i / 256);
        byte b = (byte) (i % 256);
        System.out.println(a + ":" + b);
    }

    private static String getCrc(byte[] data) {
        int high;
        int flag;

        // 16位寄存器，所有数位均为1
        int wcrc = 0xffff;
        for (int i = 0; i < data.length; i++) {
            // 16 位寄存器的高位字节
            high = wcrc >> 8;
            // 取被校验串的一个字节与 16 位寄存器的高位字节进行“异或”运算
            wcrc = high ^ data[i];

            for (int j = 0; j < 8; j++) {
                flag = wcrc & 0x0001;
                // 把这个 16 寄存器向右移一位
                wcrc = wcrc >> 1;
                // 若向右(标记位)移出的数位是 1,则生成多项式 1010 0000 0000 0001 和这个寄存器进行“异或”运算
                if (flag == 1)
                    wcrc ^= 0xa001;
            }
        }
        return Integer.toHexString(wcrc);
    }

    public static char Crc16Calc(byte[] data_arr, int data_len) {
        char crc16 = 0;
        int i;
        for (i = 0; i < (data_len); i++) {
            crc16 = (char) ((crc16 >> 8) | (crc16 << 8));
            crc16 ^= data_arr[i] & 0xFF;
            crc16 ^= (char) ((crc16 & 0xFF) >> 4);
            crc16 ^= (char) ((crc16 << 8) << 4);
            crc16 ^= (char) (((crc16 & 0xFF) << 4) << 1);
        }
        return crc16;
    }

    public static String mkCrc16(byte[] b) {
        CRC16 crc16 = new CRC16();

        for (int i = 0; i < b.length; i++) {
            crc16.update(b[i]);
        }

        return Integer.toHexString(crc16.value);
    }

    public static String evalCRC16(byte[] data) {
        int crc = 0xFFFF;

        for (int i = 0; i < data.length; i++) {
            crc = (data[i] << 8) ^ crc;

            for (int j = 0; j < 8; ++j) {
                if ((crc & 0x8000) != 0)
                    crc = (crc << 1) ^ 0x1021;
                else
                    crc <<= 1;
            }
        }
        return Integer.toHexString((crc ^ 0xFFFF) & 0xFFFF);
    }

    public static String getCRC(byte[] bytes) {
        int CRC = 0x0000ffff;
        int POLYNOMIAL = 0x0000a001;
        int i, j;
        for (i = 0; i < bytes.length; i++) {
            CRC ^= ((int) bytes[i] & 0x000000ff);
            for (j = 0; j < 8; j++) {
                if ((CRC & 0x00000001) != 0) {
                    CRC >>= 1;
                    CRC ^= POLYNOMIAL;
                } else {
                    CRC >>= 1;
                }
            }
        }
        return Integer.toHexString(CRC);
    }
}
