package schema.behavior.mediator.second;

/**
 * Author: zongfulin
 * Date: 2021/3/30
 * Time: 10:23 AM
 * Description:
 */
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name){
        this.name  = name;
    }

    public void sendMessage(String message){
        ChatRoom.showMessage(this,message);
    }
}
