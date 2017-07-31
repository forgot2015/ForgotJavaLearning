package other.callback;

/**
 * Created by forgot on 2017/6/13.
 */
public class View {
    OnClickListener onClickListener;
    void setOnClickListener(OnClickListener onClickListener){
        this.onClickListener =onClickListener;
    }

    void touchScreen(){
        if (onClickListener!=null){
            System.out.println("你点击了屏幕");
            onClickListener.onClick();
        }
    }
}
