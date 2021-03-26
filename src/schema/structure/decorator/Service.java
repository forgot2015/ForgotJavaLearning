package schema.structure.decorator;

/**
 * Author: zongfulin
 * Date: 2021/3/26
 * Time: 10:20 AM
 * Description:
 */
public class Service extends ContextWrapper{
    public Service() {
        super(null);
    }

    @Override
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
