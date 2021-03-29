package schema.behavior.interpreter;

/**
 * Author: zongfulin
 * Date: 2021/3/29
 * Time: 1:35 PM
 * Description:
 */
public class EqualExpression extends ArithmeticExpression {
    private ArithmeticExpression left, right;//等号左右两边的内容

    public EqualExpression(ArithmeticExpression left, ArithmeticExpression right) {
        this.left = left;
        this.right = right;
    }


    @Override
    public Object interpret(Context context) {//解释等号表达式的结果，并将结果保存到context，变量名为key,值为value
        context.put((String) left.interpret(context), (int) right.interpret(context));
        return null;
    }
}
