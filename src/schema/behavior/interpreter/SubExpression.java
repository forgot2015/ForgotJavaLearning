package schema.behavior.interpreter;

/**
 * Author: zongfulin
 * Date: 2021/3/29
 * Time: 1:35 PM
 * Description:
 */
public class SubExpression extends ArithmeticExpression {
    private ArithmeticExpression left, right;//减号左右两边的内容

    public SubExpression(ArithmeticExpression left, ArithmeticExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Integer interpret(Context context) {//解释减法表达式的结果，即算出left-right的结果
        return context.get((String) left.interpret(context)) - context.get((String) right.interpret(context));
    }
}