import java.util.Arrays;
import java.util.concurrent.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Author: zongfulin
 * Date: 2021/4/2
 * Time: 11:04
 * Description:
 */
public class MainTest {
    //    private static ExecutorService executor = Executors.newFixedThreadPool(15);
    private static ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 100, 0, TimeUnit.SECONDS, new ArrayBlockingQueue<>(1));

    public static void main(String[] args) {
//        for (int i = 0; i < 20; i++) {
//            executor.execute(new SubThread());
//        }
//        System.out.println((11 << 4) + 3);
//        System.out.println(11 << 4 | 3);

//        double voltage = 0.1;
//        int v1 = (int) (voltage * 10);
//        String hex = Integer.toHexString(v1);
//        System.out.println(Arrays.toString(hexString2Bytes(fillHexToFour(hex))));

//        浮点型相加后可能数值不对
//        float sum = 0.0f;
//        double sumD = 0.0;
//        for (int i = 0; i < 100; i++) {
//            sum += 0.1;
//            sumD += 0.1;
//        }
//        System.out.println(sum);
//        System.out.println(sumD);

//        String string = "ʕ ᵔᴥᵔ ʔ";
//        String string = "你呢(ʕ ᵔᴥᵔ ʔ";
        String string = "三星电子Account: 996402 是您的三星账号验证码(用于注册，登录，绑定手机号，重置密码等)";
//        String string = " -~`!@#$%^&*()_=+{};,:<>?/西藏自治区拉萨市墨竹工卡县ABabcdefghijk-!@#%&=_+;,:<>";
        String regex = "[-~`!@#$%^&*()_=+{};,:<>?/|.—「」【】；‘：《》，。、？\\s\\w\\u4e00-\\u9fa5]*";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(string);
        System.out.println("m.matches() = " + m.matches());
        System.out.println("m.find() = " + m.find());
        System.out.println("m.toString() = " + m.toString());
        System.out.println("string.matches(regex) = " + string.matches(regex));
    }

    public static String fillHexToFour(String hex) {
        String newStr = "";
        if (hex.length() == 0) {
            newStr = "0000";
        } else if (hex.length() == 1) {
            newStr = "000" + hex;
        } else if (hex.length() == 2) {
            newStr = "00" + hex;
        } else if (hex.length() == 3) {
            newStr = "0" + hex;
        }
        return newStr;
    }

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

    static class SubThread implements Runnable {
        @Override
        public void run() {
            try {
                Thread.sleep(1000);
                System.out.println("SubThread");
            } catch (InterruptedException e) {
                //do nothing
                System.out.println(e.getMessage());
            }
        }
    }
}
