package schema.creation.abstractFactory.dao.user;


import schema.creation.abstractFactory.bean.User;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by forgot on 2017/6/18.
 */
public class SQLiteUserDao implements IUserDao {
    Map<String, User> userMap = new HashMap<>();

    @Override
    public void addUser(User user) {
        userMap.put(user.getUsername(), user);
    }

    @Override
    public void removeUser(User user) {
        userMap.remove(user.getUsername());

    }

    @Override
    public User getUser(String name) {
        return userMap.get(name);
    }

    @Override
    public String toString() {
        return "SQLiteUserDao{" +
                "userMap=" + userMap +
                '}';
    }
}
