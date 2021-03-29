package schema.behavior.interpreter;

/**
 * Author: zongfulin
 * Date: 2021/3/29
 * Time: 1:34 PM
 * Description:
 */
public class AddExpression extends ArithmeticExpression {
    private ArithmeticExpression left, right;//加号左右两边的内容

    public AddExpression(ArithmeticExpression left, ArithmeticExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Integer interpret(Context context) {//解释加法表达式的结果，即算出left+right的结果
        return  context.get((String) left.interpret(context)) + context.get((String) right.interpret(context));
    }
}
