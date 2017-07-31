package schema.behavior.observer.onclickcallback;

/**
 * Created by forgot on 2017/6/16.
 */
public class View {
    OnClickListener onClickListener;

    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
        System.out.println(onClickListener + ":注册回调监听");
    }

    public void touchScreen() {
        if (null != onClickListener) {
            System.out.println(onClickListener+":你点击了屏幕");
            onClickListener.onClick();
        }
    }

}
