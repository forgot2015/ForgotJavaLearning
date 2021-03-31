package other.callback;

/**
 * Created by forgot on 2017/6/12.
 */
public class FooBar {
    private CallBack callBack;

    public void setCallBack(CallBack callBack) {
        this.callBack = callBack;
        doSth();
    }

    public void doSth() {
        callBack.postExec();
    }
}
