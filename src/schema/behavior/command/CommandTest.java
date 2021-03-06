package schema.behavior.command;

/**
 * Author: zongfulin
 * Date: 2021/3/24
 * Time: 9:52 AM
 * Description:命令模式测试
 */
public class CommandTest {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new ShutdownCommand(receiver);
        Invoker invoker = new Invoker(command);
        invoker.action();

        Receiver receiver1 = new Receiver();
        Command command1 = new ShutdownCommand(receiver1);
        Invoker invoker1 = new Invoker(command1);
        invoker1.action();
    }
}
