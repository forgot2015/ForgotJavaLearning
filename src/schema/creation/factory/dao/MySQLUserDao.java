package schema.creation.factory.dao;

import schema.creation.factory.bean.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by forgot on 2017/6/18.
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
