package other;

/**
 * Created by forgot on 2017/6/20.
 * 用卫语句来替代多层if else if的结构。
 * 使代码结构更加清晰，易于理解
 * 或者用switch语句 或者用状态模式
 */
public class GuardStatement {
    public static void main(String[] args) {
        whatDay(2);
        whatDayWithGuardStatement(3);
        whatDayWithSwitch(4);
    }

    static void whatDay(int i) {
        if (i == 1) {
            System.out.println("星期一");
        } else if (i == 2) {
            System.out.println("星期二");
        } else if (i == 3) {
            System.out.println("星期三");
        } else if (i == 4) {
            System.out.println("星期四");
        } else if (i == 5) {
            System.out.println("星期五");
        } else if (i == 6) {
            System.out.println("星期六");
        } else if (i == 7) {
            System.out.println("星期天");
        }
    }

    static void whatDayWithGuardStatement(int i) {
        if (i == 1) {
            System.out.println("星期一");
            return;
        }
        if (i == 2) {
            System.out.println("星期二");
            return;
        }
        if (i == 3) {
            System.out.println("星期三");
            return;
        }
        if (i == 4) {
            System.out.println("星期四");
            return;
        }
        if (i == 5) {
            System.out.println("星期五");
            return;
        }
        if (i == 6) {
            System.out.println("星期六");
            return;
        }
        if (i == 7) {
            System.out.println("星期天");
            return;
        }
    }

    static void whatDayWithSwitch(int i) {
        switch (i) {
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期天");
                break;
            default:
                break;
        }
    }
}
