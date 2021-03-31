package schema.behavior.command;

/**
 * Author: zongfulin
 * Date: 2021/3/29
 * Time: 11:08 AM
 * Description:命令接收者
 */
public class Receiver {
    public void action() {//接收者执行具体的操作
        System.out.println("接收者执行具体的操作");
        System.out.println("开始执行关机操作：");
        System.out.println("退出所有程序进程");
        System.out.println("关机～");
    }
}
