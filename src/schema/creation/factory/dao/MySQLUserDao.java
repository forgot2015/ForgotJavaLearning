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
        int index = -1;
        for (int i = 0, size = userList.size(); i < size; i++) {
            if (name.equals(userList.get(i).getUsername())) {
                index = i;
                break;
            }
        }
        if (index >= 0) {
            return userList.get(index);
        }
        return null;
    }
}
