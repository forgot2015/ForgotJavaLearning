package schema.behavior.visitor;

/**
 * Author: zongfulin
 * Date: 2021/3/29
 * Time: 4:57 PM
 * Description:视频可选择下载或在线播放
 */
public class Video extends WebRes {
    public Video(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void download() {
        System.out.println("下载视频~~");
    }

    public void playVideo() {//视频类独有方法
        System.out.println("播放视频ing");
    }
}
