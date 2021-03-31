package other;

import java.util.Locale;

/**
 * Created by forgot on 2017/6/24.
 */
public class Test2 {
    static byte[] rxByteArray = null;// 接收到的字节信息

    public static void main(String[] args) {
        rxByteArray = new byte[]{11, 22, 33, 44};
        String str = bytesToHexString(rxByteArray, rxByteArray.length);
        System.out.println(str);
    }

    private static String bytesToHexString(byte[] src, int size) {
        StringBuilder ret = new StringBuilder();
        if (src == null || size <= 0) {
            return null;
        }
        for (int i = 0; i < size; i++) {
            String hex = Integer.toHexString(src[i] & 0xFF);
            if (hex.length() < 2) {
                hex = "0" + hex;
            }
            ret.append(hex).append(" ");
        }
        return ret.toString().toUpperCase(Locale.US);
    }
}
