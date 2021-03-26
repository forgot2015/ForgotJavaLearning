package schema.structure.decorator;

/**
 * Author: zongfulin
 * Date: 2021/3/26
 * Time: 10:09 AM
 * Description:
 */
public abstract class Context {

    public abstract void setTheme(String theme);

    public abstract String getTheme();

    public abstract void play();

    public abstract void takeARest();

    public abstract void eat();
}
