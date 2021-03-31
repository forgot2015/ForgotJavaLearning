package other.callback;

import jdk.nashorn.internal.codegen.CompilerConstants;

/**
 * Created by forgot on 2017/6/12.
 */
public class Test {
    public static void main(String[] args) {
        FooBar fooBar = new FooBar();
        fooBar.setCallBack(callBack);

        //Android中的onClickListener是典型的回调接口
        View view = new View();
        OnClickListener onClickListener = new OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("onClick()");
            }
        };
        view.setOnClickListener(onClickListener);
        view.touchScreen();

        System.out.println("=====分割线=====");
        view.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("这是onClick里的回调方法");
            }
        });
        view.touchScreen();
    }

    static CallBack callBack = new CallBack() {
        @Override
        public void postExec() {
            System.out.println("在Test类中实现但不能被Test的对象引用,而由FooBar对象调用");
        }
    };
}
