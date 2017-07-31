package schema.behavior.observer.onclickcallback;

/**
 * Created by forgot on 2017/6/17.
 */
public class OnClickTest {
    public static void main(String[] args) {
        View view =new View();
        view.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick() {
                System.out.println(view+":回调onClick方法");
            }
        });
        view.touchScreen();
    }
}
