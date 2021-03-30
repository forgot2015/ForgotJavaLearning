package schema.behavior.visitor;

/**
 * Author: zongfulin
 * Date: 2021/3/29
 * Time: 5:04 PM
 * Description:忙人要先下载影音,有空再看
 */
public class Busy implements Visitor {
    private String name;

    public Busy(String name) {
        this.name = name;
    }

    @Override
    public void visit(Music music) {
        System.out.println(name + "浏览音乐网站：" + music.getName());
        music.download();
    }

    @Override
    public void visit(Video video) {
        System.out.println(name + "浏览视频网站：" + video.getName());
        video.download();
    }
}
