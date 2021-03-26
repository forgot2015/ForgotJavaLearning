package schema.structure.decorator;

/**
 * Author: zongfulin
 * Date: 2021/3/26
 * Time: 10:11 AM
 * Description:
 */
public class ContextWrapper extends Context {
    Context mBase;

    public ContextWrapper(Context context) {
        this.mBase = context;
    }

    protected void attachBaseContext(Context context) {
        if (mBase != null) {
            throw new IllegalStateException("Base context already set");
        }
        this.mBase = context;
    }

    public Context getBaseContext() {
        return this.mBase;
    }

    public void setTheme(String theme) {
        mBase.setTheme(theme);
    }

    @Override
    public String getTheme() {
        return mBase.getTheme();
    }

    @Override
    public void play() {
        mBase.play();
    }

    @Override
    public void takeARest() {
        mBase.takeARest();
    }

    @Override
    public void eat() {
        mBase.eat();
    }
}
