package schema.structure.decorator;

/**
 * Author: zongfulin
 * Date: 2021/3/26
 * Time: 10:16 AM
 * Description:
 */
public class Activity extends ContextThemeWrapper {
    public Activity() {
        super();
    }

    @Override
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
