package schema.behavior.state.base;

/**
 * Created by forgot on 2017/6/20.
 */
public class OpenState implements State {
    @Override
    public void handle(String s) {
        System.out.println("ConcreteState1 handle 开机:"+s);
    }
}
