package schema.creation.factory.dao;

import schema.creation.factory.bean.User;

/**
 * Created by forgot on 2017/6/18.
 */
public interface IUserDao {
    void addUser(User user);
    void removeUser(User user);
    User getUser(String name);
}
