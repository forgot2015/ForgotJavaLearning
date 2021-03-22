package schema.creation.abstractFactory.dao.user;


import schema.creation.abstractFactory.bean.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by forgot on 2017/6/18.
 * 不能用ArrayList，应该用HashMap
 */
public class MySQLUserDao implements IUserDao {
    List<User> userList = new ArrayList<>();

    @Override
    public void addUser(User user) {
        userList.add(user);
    }

    @Override
    public void removeUser(User user) {
        userList.remove(user);
    }

    @Override
    public User getUser(String name) {
        return null;
    }
}
