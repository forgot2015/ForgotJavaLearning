package schema.behavior.state.base;

/**
 * Created by forgot on 2017/6/20.
 * 状态模式，属于行为模式的一种。 通过改变状态，来将具体行为指向不同的具体执行类
 * 环境类Context的行为request()是委派给某一个具体状态类的。通过使用多态性原则，可以动态改变环境类Context的属性State的内容，
 * 使其从指向一个具体状态类变换到指向另一个具体状态类，从而使环境类的行为request()由不同的具体状态类来执行。
 */
public class StateTest {
    public static void main(String[] args) {
        State state1 = new OpenState();
        State state2 = new CloseState();
        Context context = new Context();
        context.setState(state1);
        context.request("test");
        context.setState(state2);
        context.request("test2");
    }
}
