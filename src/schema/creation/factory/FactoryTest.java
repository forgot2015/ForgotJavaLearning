package schema.creation.factory;

import schema.creation.factory.bean.User;
import schema.creation.factory.dao.IUserDao;
import schema.creation.factory.factory.IFactory;
import schema.creation.factory.factory.MySQLFactory;
import schema.creation.factory.factory.OracleFactory;

/**
 * Created by forgot on 2017/6/18.
 * 工程模式，和简单工厂比起来，职责更加分离；单一
 * 工厂类只负责创建产品，而不负责产品的方法，产品的方法在具体产品中实现
 */
public class FactoryTest {
    public static void main(String[] args) {
        System.out.println("---test MySQLFactory---");
        IFactory factory = new MySQLFactory();
        IUserDao userDao = factory.createUserDao();
        System.out.println(userDao.getUser("test"));
        User user0 = new User("test", "123456");
        userDao.addUser(user0);
        System.out.println(userDao.getUser("test"));

        System.out.println("---test OracleFactory---");
//        创建工厂
        IFactory factory1 = new OracleFactory();
//        创建产品DAO
        IUserDao userDao1 = factory1.createUserDao();
//        创建具体产品
        User user = new User("forgot", "123456");
        User user1 = new User("baobei", "654321");
//        添加产品
        userDao1.addUser(user);
        userDao1.addUser(user);
        userDao1.addUser(user1);
        System.out.println(userDao1.getUser("baobei"));
        System.out.println(userDao1.getUser("forgot"));
        System.out.println(userDao1.toString());
        userDao1.removeUser(user1);
        System.out.println(userDao1.toString());

    }
}
