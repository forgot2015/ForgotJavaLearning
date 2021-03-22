package schema.creation.abstractFactory.dao.user;


import schema.creation.abstractFactory.bean.User;

/**
 * Created by forgot on 2017/6/18.
 */
public interface IUserDao {
    void addUser(User user);

    void removeUser(User user);

    User getUser(String name);
}
