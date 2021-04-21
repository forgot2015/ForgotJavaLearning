package schema.behavior.interpreter;

/**
 * Author: zongfulin
 * Date: 2021/3/29
 * Time: 1:34 PM
 * Description:数字
 */
public class NumExpression extends ArithmeticExpression {
    private String strNum;

    public NumExpression(String strNum) {
        this.strNum = strNum;
    }

    @Override
    public Integer interpret(Context context) {//解释数字
        return Integer.parseInt(strNum);
    }
}