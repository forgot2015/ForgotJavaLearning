public class CrcUtils {
    /**
     * @param bytes
     * @param length 需要计算crc的长度，如总长8位，但只有前6位需要计算crc，则length=6
     * @return
     */
    public static String getCRC16(byte[] bytes, int length) {
        byte[] newBytes = new byte[length];
        System.arraycopy(bytes, 0, newBytes, 0, length);
        return getCRC16(newBytes);
    }

    /**
     * 计算CRC16校验码
     *
     * @param bytes
     * @return
     */
    public static String getCRC16(byte[] bytes) {
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
        CRC = ((CRC & 0x0000FF00) >> 8) | ((CRC & 0x000000FF) << 8);
        return Integer.toHexString(CRC).toUpperCase();
    }

    /**
     * 返回CRC16
     *
     * @param bytes
     * @param length 要计算 crc 的字符长度. 如总长度 24,但 length=22,则只计算前 22 位的 crc
     * @return
     */
    public static byte[] getCrc16Byte(byte[] bytes, int length) {
        byte[] newBytes = new byte[length];
        System.arraycopy(bytes, 0, newBytes, 0, length);
        return getCrc16Byte(newBytes);
    }

    /**
     * 获取16位循环校验码
     *
     * @param bytes
     * @return 返回两个16进制数，即4个字节
     */
    public static byte[] getCrc16Byte(byte[] bytes) {
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
        CRC = ((CRC & 0x0000FF00) >> 8) | ((CRC & 0x000000FF) << 8);
//        crc 有可能会变成了 0000 要转换一下
//        CRC = (CRC & 0x0000FF00) | (CRC & 0x000000FF);
//        注意高低位要不要换过来
        String crcStr = Integer.toHexString(CRC).toUpperCase();
        if (crcStr.length() < 4) {
            crcStr = fillWithZero(crcStr);
        }
        return hexString2Bytes(crcStr);
    }

    private static String fillWithZero(String s) {
        String newStr = "";
        if (s.length() == 0) {
            newStr = "0000";
        } else if (s.length() == 1) {
            newStr = "000" + s;
        } else if (s.length() == 2) {
            newStr = "00" + s;
        } else if (s.length() == 3) {
            newStr = "0" + s;
        }
        return newStr;
    }

    /**
     * Hex string to bytes.
     * <p>e.g. hexString2Bytes("00A8") returns { 0, (byte) 0xA8 }</p>
     *
     * @param hexString The hex string.
     * @return the bytes
     */
    public static byte[] hexString2Bytes(String hexString) {
        int len = hexString.length();
        if (len % 2 != 0) {
            hexString = "0" + hexString;
            len = len + 1;
        }
        char[] hexBytes = hexString.toUpperCase().toCharArray();
        byte[] ret = new byte[len >> 1];
        for (int i = 0; i < len; i += 2) {
            ret[i >> 1] = (byte) (hex2Dec(hexBytes[i]) << 4 | hex2Dec(hexBytes[i + 1]));
        }
        return ret;
    }

    private static int hex2Dec(final char hexChar) {
        if (hexChar >= '0' && hexChar <= '9') {
            return hexChar - '0';
        } else if (hexChar >= 'A' && hexChar <= 'F') {
            return hexChar - 'A' + 10;
        } else {
            throw new IllegalArgumentException();
        }
    }
}
