package schema.behavior.mediator.second;

/**
 * Author: zongfulin
 * Date: 2021/3/30
 * Time: 10:23 AM
 * Description:
 */
public class MediatorPatternDemo {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
