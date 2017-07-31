package other.thread;

/**
 * Created by forgot on 2017/6/20.
 */
public class SwitchTest {
    public static void main(String[] args) {
        switchTest("1","E20444");
    }

    static void switchTest(String msg, String obj) {
        switch (msg) {
            case "1":
                switch (obj.substring(0, 4)) {
                    case "E203":
                        System.out.println("E203");
                        break;
                    case "E204":
                        System.out.println("E204");
                        break;
                    case "E205":
                        System.out.println("E205");
                        break;

                }
            case "2":
            case "3":
        }
    }
}
