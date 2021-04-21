package schema.behavior.responsibility;

/**
 * Author: zongfulin
 * Date: 2021/3/29
 * Time: 3:10 PM
 * Description:
 */
public class BeijingPostman extends Postman {//北京快递员

    @Override
    public void handleCourier(String address) {
        if (address.equals("Beijing")) {//北京地区的则派送
            System.out.println("派送到北京,北京处理掉了");
        } else {//否则交给下一个快递员去处理
            if (nextPostman != null) {
                System.out.println("北京处理不了,交由下一快递员派送");
                nextPostman.handleCourier(address);
            } else {
                System.out.println("没有快递员能派送,快递将原路打回");
            }
        }
    }
}
