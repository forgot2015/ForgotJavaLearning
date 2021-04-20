package schema.behavior.mediator;

/**
 * Author: zongfulin
 * Date: 2021/3/29
 * Time: 2:02 PM
 * Description:房屋中介类
 */
public interface HouseMediator {

    /**
     * 通知方法
     *
     * @param person
     * @param msg
     */
    void notice(Person person, String msg);
}
