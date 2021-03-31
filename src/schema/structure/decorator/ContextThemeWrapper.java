package schema.structure.decorator;

/**
 * Author: zongfulin
 * Date: 2021/3/26
 * Time: 10:21 AM
 * Description:
 */
public class ContextThemeWrapper extends ContextWrapper {

    private String theme;

    public ContextThemeWrapper() {
        super(null);
    }

    @Override
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override
    public void setTheme(String theme) {
        this.theme = "ContextThemeWrapper:" + theme;
        System.out.println("设置玩游戏的主题: " + this.theme);
    }

    @Override
    public String getTheme() {
        return theme;
    }
}
