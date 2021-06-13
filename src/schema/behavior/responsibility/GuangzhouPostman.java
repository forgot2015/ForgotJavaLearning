package schema.behavior.responsibility;

/**
 * Author: zongfulin
 * Date: 2021/3/29
 * Time: 3:12 PM
 * Description:
 */
public class GuangzhouPostman extends Postman {//广州快递员

    @Override
    public void handleExpress(String address) {
        if (address.equals("Guangzhou")) {
            System.out.println("派送到广州,广州处理掉了");
        } else {
            if (getNextChain() != null) {
                System.out.println("广州处理不了,交由下一快递员派送");
                getNextChain().handleExpress(address);
            } else {
                System.out.println("没有快递员能派送,快递将原路打回");
            }
        }
    }
}