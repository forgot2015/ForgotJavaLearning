package schema.behavior.responsibility;

/**
 * Author: zongfulin
 * Date: 2021/3/29
 * Time: 3:11 PM
 * Description:上海快递员
 */
public class ShanghaiPostman extends Postman {

    @Override
    public void handleCourier(String address) {
        if (address.equals("Shanghai")) {
            System.out.println("派送到上海");
        } else {
            if (nextPostman != null) {
                System.out.println("上海处理不了,交由下一快递员派送");
                nextPostman.handleCourier(address);
            } else {
                System.out.println("没有快递员能派送,快递将原路打回");
            }
        }
    }
}

