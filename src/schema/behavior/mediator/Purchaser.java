package schema.behavior.mediator;

/**
 * Author: zongfulin
 * Date: 2021/3/29
 * Time: 2:13 PM
 * Description:
 */
public class Purchaser extends Person{//买房者类，继承Person
    public Purchaser(HouseMediator houseMediator) {
        super(houseMediator);
    }

    @Override
    public void send(String message) {
        System.out.println("买房者发布信息：" + message);
        houseMediator.notice(this, message);
    }

    @Override
    public void getNotice(String message) {
        System.out.println("买房者收到消息：" + message);
    }
}
