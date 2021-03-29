package schema.behavior.command;

/**
 * Author: zongfulin
 * Date: 2021/3/29
 * Time: 11:11 AM
 * Description:命令调用者
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action() {
        System.out.println("调用者执行指令");
        command.execute();
    }
}
