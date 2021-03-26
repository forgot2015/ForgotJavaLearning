package schema.structure.decorator;

/**
 * Author: zongfulin
 * Date: 2021/3/26
 * Time: 2:32 PM
 * Description:装饰器模式
 * 装饰器模式允许向一个现有的对象添加新的功能，同时又不改变其结构。这种类型的设计模式属于结构型模式，它是作为现有的类的一个包装。
 *
 * 装饰器模式与外观模式类似,但比外观模式要负责一些,且符合开闭原则,更容易扩展维护
 * 缺点
 * 设计模式基本都有这个缺点，就是会生成额外的类，增加系统复杂度。
 * 由于装饰可以层层包装，交叉包装，如果包装的很深的话，调试排错会比较麻烦，也不容易理解。
 */
public class DecoratorTest {
    public static void main(String[] args) {
        Activity activity = new Activity();
        ContextImpl contextImpl = new ContextImpl();
        activity.attachBaseContext(contextImpl);
        activity.setTheme("activity");
        System.out.println(activity.getTheme());

        Service service = new Service();
        service.attachBaseContext(contextImpl);
        service.setTheme("service");
        System.out.println(service.getTheme());
    }
}
