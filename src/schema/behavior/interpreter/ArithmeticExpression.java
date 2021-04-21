package schema.behavior.interpreter;

/**
 * Author: zongfulin
 * Date: 2021/3/29
 * Time: 11:26 AM
 * Description: 算术表达式
 */
public abstract class ArithmeticExpression {
    public abstract Object interpret(Context context);
}
