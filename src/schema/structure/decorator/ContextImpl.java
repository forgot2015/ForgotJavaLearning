package schema.structure.decorator;

/**
 * Author: zongfulin
 * Date: 2021/3/26
 * Time: 10:10 AM
 * Description:
 */
public class ContextImpl extends Context{
    private String theme;

    @Override
    public void setTheme(String theme) {
        this.theme = "ContextImpl:"+theme;
        System.out.println("设置玩游戏的主题: "+this.theme);
    }

    @Override
    public String getTheme() {
        return theme;
    }

    @Override
    public void play() {
        System.out.println("ContextImpl 玩游戏了");
    }

    @Override
    public void takeARest() {
        System.out.println("ContextImpl 休息了");
    }

    @Override
    public void eat() {
        System.out.println("ContextImpl 吃东西了");
    }
}
