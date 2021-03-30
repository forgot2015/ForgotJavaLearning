package schema.behavior.visitor;

/**
 * Author: zongfulin
 * Date: 2021/3/29
 * Time: 4:58 PM
 * Description:
 */
public interface Visitor {
    void visit(Music music);

    void visit(Video video);
}
