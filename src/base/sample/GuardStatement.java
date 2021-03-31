package base.sample;

/**
 * Created by forgot on 2017/6/20.
 * 用卫语句来替代多层if else if的结构。
 * 使代码结构更加清晰，易于理解
 * 或者用switch语句 或者用状态模式
 */
public class GuardStatement {
    public static void main(String[] args) {
        whatDayWithIfElse(2);
        whatDayWithGuardStatement(3);
        whatDayWithSwitch(4);
        whatDayWithState(5);
    }

    static void whatDayWithIfElse(int i) {
        System.out.println("whatDayWithIfElse");
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
        System.out.println("whatDayWithGuardStatement");
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
        System.out.println("whatDayWithSwitch");
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

    private static void whatDayWithState(int i) {
        System.out.println("whatDayWithState");
        DayManager dayManager = new DayManager();
        dayManager.setDayState(i);
    }

    static class DayManager {
        private DayState dayState;

        public void setDayState(int day) {
            if (day == 1) {
                dayState = new Monday();
            } else if (day == 2) {
                dayState = new Tuesday();
            } else if (day == 3) {
                dayState = new Wednesday();
            } else if (day == 4) {
                dayState = new Thursday();
            } else if (day == 5) {
                dayState = new Friday();
            } else if (day == 6) {
                dayState = new Saturday();
            } else if (day == 7) {
                dayState = new Sunday();
            }
            dayState.dayPrint();
        }
    }

    interface DayState {
        void dayPrint();
    }

    static class Monday implements DayState {
        @Override
        public void dayPrint() {
            System.out.println("星期一");
        }
    }

    static class Tuesday implements DayState {

        @Override
        public void dayPrint() {
            System.out.println("星期二");
        }
    }

    static class Wednesday implements DayState {

        @Override
        public void dayPrint() {
            System.out.println("星期三");
        }
    }

    static class Thursday implements DayState {

        @Override
        public void dayPrint() {
            System.out.println("星期四");
        }
    }

    static class Friday implements DayState {

        @Override
        public void dayPrint() {
            System.out.println("星期五");
        }
    }

    static class Saturday implements DayState {

        @Override
        public void dayPrint() {
            System.out.println("星期六");
        }
    }

    static class Sunday implements DayState {

        @Override
        public void dayPrint() {
            System.out.println("星期天");
        }
    }
}
