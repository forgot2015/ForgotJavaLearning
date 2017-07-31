package other.callback;

/**
 * Created by forgot on 2017/6/12.
 */
public class FooBar {
    private ICallBack iCallBack;
    public void setiCallBack(ICallBack iCallBack){
        this.iCallBack=iCallBack;
        doSth();
    }

    public void doSth(){
        iCallBack.postExec();
    }
}
