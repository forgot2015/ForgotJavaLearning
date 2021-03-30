package schema.behavior.template;

/**
 * Author: zongfulin
 * Date: 2021/3/29
 * Time: 10:36 AM
 * Description:模板方法模式
 * 定义一个操作中的算法框架，而将一些步骤延迟到子类中，使得子类可以不改变一个算法的结构即可重定义算法的某些特定步骤。
 * <p>
 * 模板方法模式主要是用来定义一套流程下来的固定步骤，而具体的步骤实现则可以是不固定的。
 *
 * 一次性实现算法的执行顺序和固定不变部分，可变部分则交由子类来实现。
 * 多个子类中拥有相同的行为时，可以将其抽取出来放在父类中，避免重复的代码。
 * 使用钩子方法来让子类决定父类的某个步骤是否执行，实现子类对父类的反向控制。
 * 控制子类扩展。模板方法只在特定点调用钩子方法，这样就只允许在这些点进行扩展。
 *
 * Android中的源码分析
 * Android中View的draw方法就是使用了模板方法模式：
 * 另外，像Activity的生命周期，AsyncTask等等也是用到了模板方法模式
 */
public class TemplateTest {
    public static void main(String[] args) {
        System.out.println("派送 A");
        PostTemplate templateA = new PostA();
        templateA.post();

        System.out.println("派送 B");
        PostTemplate templateB = new PostB();
        templateB.post();
    }
}
