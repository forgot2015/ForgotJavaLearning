package schema.behavior.interpreter;

/**
 * Created with IntelliJ IDEA.
 * <p>
 * Author: forgot2015
 * Date: 2021/3/24
 * Time: 9:48 AM
 * Description:解释器模式.给定一门语言，定义它的文法的一种表示，并定义一个解释器，该解释器使用该表示来解释语言中的句子。
 * 解释器模式实际开发中很少用到。
 */
public class InterpreterTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.read("a = 1024");//读取表达式
        calculator.read("b = 512");
        System.out.println("a = 1024");
        System.out.println("b = 512");

        calculator.read("a + b");
        System.out.println("a + b = " + calculator.calculate());//计算结果
        calculator.read("a - b");
        System.out.println("a - b = " + calculator.calculate());
    }
}
