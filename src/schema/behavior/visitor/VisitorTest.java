package schema.behavior.visitor;

/**
 * Author: zongfulin
 * Date: 2021/3/29
 * Time: 10:44 AM
 * Description:访问者模式.
 * 封装某些作用于某种数据结构中各元素的操作，它可以在不改变数据结构的前提下定义作用于这些元素的新的操作。
 * 访问者模式是一种将数据结构和数据操作分离的设计模式。
 * 访问者模式比较复杂，而且实际使用的地方并不多。
 * 访问者模式适用于数据结构稳定的元素操作上，一旦数据结构易变，则不适用。
 */
public class VisitorTest {
    public static void main(String[] args) {
        //创建不同的元素
        Music wangyiyue = new Music("网易云音乐");
        Music kugou = new Music("酷狗");
        Video youku = new Video("优酷");
        Video iqiyi = new Video("爱奇艺");

        //放入对象结构中
        Websites websites = new Websites();
        websites.addWeb(wangyiyue);
        websites.addWeb(kugou);
        websites.addWeb(youku);
        websites.addWeb(iqiyi);

        Visitor idler1 = new Idler("闲人1号");
        websites.accept(idler1);//集合接受idler1的访问

        System.out.println("-------------------------------------");
        Visitor busy1 = new Busy("忙人2号");
        websites.accept(busy1);////集合接受busy1的访问
    }
}
