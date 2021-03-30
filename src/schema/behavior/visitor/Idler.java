package schema.behavior.visitor;

/**
 * Author: zongfulin
 * Date: 2021/3/29
 * Time: 5:02 PM
 * Description:闲人直接在线观看影音
 */
public class Idler implements Visitor {
    private String name;

    public Idler(String name) {
        this.name = name;
    }

    @Override
    public void visit(Music music) {
        System.out.println(name + "浏览音乐网站：" + music.getName());
        music.playMusic();
    }

    @Override
    public void visit(Video video) {
        System.out.println(name + "浏览视频网站：" + video.getName());
        video.playVideo();
    }
}
