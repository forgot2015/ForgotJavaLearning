package schema.behavior.interpreter;

/**
 * Author: zongfulin
 * Date: 2021/3/29
 * Time: 1:34 PM
 * Description:变量
 */
public class VarExpression extends ArithmeticExpression {
    private String var;

    public VarExpression(String var) {
        this.var = var;
    }

    @Override
    public String interpret(Context context) {//解释变量
        return var;
    }
}