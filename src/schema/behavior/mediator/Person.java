package schema.behavior.mediator;

/**
 * Author: zongfulin
 * Date: 2021/3/29
 * Time: 2:03 PM
 * Description:人物类
 */
public abstract class Person {
    protected HouseMediator houseMediator;

    public Person(HouseMediator houseMediator) {
        this.houseMediator = houseMediator;
    }

    public abstract void send(String message);//发布信息

    public abstract void getNotice(String message);//接受信息
}
