package other;

import java.util.Locale;

/**
 * Created by forgot on 2017/6/24.
 */
public class Test2 {
    static byte[] rxByteArray = null;// 接收到的字节信息

    public static void main(String[] args) {
        rxByteArray = new byte[]{11, 22, 33,44};
        if (rxByteArray != null) {
            System.out.println("接收 <<<<"
                    + bytesToHexString(rxByteArray,
                    rxByteArray.length));
            String str = bytesToHexString(rxByteArray, rxByteArray.length);
        }
    }
        /**
         * 转换字节为十六进制
         *
         * @param src
         * @param size
         * @return
         */

    private static String bytesToHexString(byte[] src, int size) {
        String ret = "";
        if (src == null || size <= 0) {
            return null;
        }
        for (int i = 0; i < size; i++) {
            String hex = Integer.toHexString(src[i] & 0xFF);
            if (hex.length() < 2) {
                hex = "0" + hex + " ";
            }
            ret += hex + " ";
        }
        return ret.toUpperCase(Locale.US);
    }
}
