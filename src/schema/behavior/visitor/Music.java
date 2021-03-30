package schema.behavior.visitor;

/**
 * Author: zongfulin
 * Date: 2021/3/29
 * Time: 4:56 PM
 * Description:音乐可以选择下载或在线播放
 */
public class Music extends WebRes {
    public Music(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void download() {
        System.out.println("下载音乐~~");
    }

    public void playMusic() {//音乐类独有方法
        System.out.println("播放音乐ing");
    }
}
