package schema.behavior.state.base;

/**
 * Created by forgot on 2017/6/20.
 */
public class StateContext {
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public void request(String s) {
        state.handle(s);
    }
}
