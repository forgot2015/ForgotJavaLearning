package schema.behavior.mediator.second;

import java.util.Date;

/**
 * Author: zongfulin
 * Date: 2021/3/30
 * Time: 10:22 AM
 * Description:
 */
public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString()
                + " [" + user.getName() +"] : " + message);
    }
}
