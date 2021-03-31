package schema.behavior.state.base;

/**
 * Created by forgot on 2017/6/20.
 */
public class CloseState implements State {
    @Override
    public void handle(String s) {
        System.out.println("ConcreteState2 handle 关机:"+s);
    }
}
