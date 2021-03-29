package schema.behavior.command;

/**
 * Author: zongfulin
 * Date: 2021/3/29
 * Time: 11:09 AM
 * Description:
 */
public class ShutdownCommand implements Command {
    private Receiver receiver;

    public ShutdownCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("执行关机操作");
        receiver.action();
    }
}
