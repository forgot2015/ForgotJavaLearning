package schema.behavior.responsibility;

/**
 * Author: zongfulin
 * Date: 2021/3/29
 * Time: 10:11 AM
 * Description:责任链模式
 * 多个对象中，每个对象都持有下一个对象的引用，这就构成了链这种结构。
 * 一个请求通过链的头部，一直往下传递到链上的每一个结点，直到有某个结点对这个请求做出处理为止，这就是责任链模式。
 * 责任链模式一般分为处理者与请求者。具体的处理者分别处理请求者的行为
 * <p>
 * Android 中的事件传递机制就是责任链模式
 */
public class ResponsibilityTest {
    public static void main(String[] args) {
        //创建不同的快递员对象
        Postman beijingPostman = new BeijingPostman();
        Postman shanghaiPostman = new ShanghaiPostman();
        Postman guangzhouPostman = new GuangzhouPostman();

        //创建下一个结点
        beijingPostman.setNextChain(shanghaiPostman);
        shanghaiPostman.setNextChain(guangzhouPostman);

        //处理不同地区的快递，都是从首结点北京快递员开始
        System.out.println("---有一个上海快递需要派送:---");
        beijingPostman.handleExpress("Shanghai");
        System.out.println("---有一个广州快递需要派送:---");
        beijingPostman.handleExpress("Guangzhou");
        System.out.println("---有一个美国快递需要派送:---");
        beijingPostman.handleExpress("America");
    }
}
