package schema.structure.bridge;

/**
 * Author: zongfulin
 * Date: 2021/3/26
 * Time: 5:04 PM
 * Description:桥接模式.将抽象部分与实现部分分离，使它们都可以独立的变化。
 * 优点
 * 分离了抽象与实现。让抽象部分和实现部分独立开来，分别定义接口，这有助于对系统进行分层，从而产生更好的结构化的系统。
 * 良好的扩展性。抽象部分和实现部分都可以分别独立扩展，不会相互影响。
 * 7. 缺点
 * 增加了系统的复杂性。
 * 不容易设计，抽象与实现的分离要设计得好比较有难度。
 *
 * 作者：四月葡萄
 * 链接：https://www.jianshu.com/p/acf598db6d4d
 * 来源：简书
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class BridgeTest {
    public static void main(String[] args) {
        Clothes tShirt = new TShirt();
        Clothes uniform = new Uniform();

        Person coder = new Coder();
        coder.setClothes(tShirt);
        coder.dress();

        Person student = new Student();
        student.setClothes(uniform);
        student.dress();
        student.setClothes(tShirt);
        student.dress();

    }
}
