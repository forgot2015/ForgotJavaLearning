package schema.behavior.visitor;

/**
 * Author: zongfulin
 * Date: 2021/3/29
 * Time: 4:54 PM
 * Description:网络资源
 */
public abstract class WebRes {
    public String name;

    public WebRes(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void accept(Visitor visitor);

    public abstract void download();
}
