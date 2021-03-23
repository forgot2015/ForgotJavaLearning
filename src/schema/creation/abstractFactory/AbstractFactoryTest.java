package schema.creation.abstractFactory;

import schema.creation.abstractFactory.bean.Product;
import schema.creation.abstractFactory.bean.Role;
import schema.creation.abstractFactory.bean.User;
import schema.creation.abstractFactory.dao.product.IProductDao;
import schema.creation.abstractFactory.dao.role.IRoleDao;
import schema.creation.abstractFactory.dao.user.IUserDao;
import schema.creation.abstractFactory.factory.IDaoFactory;
import schema.creation.abstractFactory.factory.OracleDaoFactory;

/**
 * Created by forgot on 2017/6/18.
 * 在工厂方法模式中一种工厂只能创建一种具体产品。而在抽象工厂模式中一种具体工厂可以创建多个种类的具体产品。
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        //创建工厂
        IDaoFactory factory = new OracleDaoFactory();
        //创建产品类型DAO
        IProductDao productDao = factory.createProductDao();
        IUserDao userDao = factory.createUserDao();
        IRoleDao roleDao = factory.createRoleDao();

        //创建具体产品
        Product product = new Product("电脑", 4999);
        User user = new User("forgot", "123456");
        Role role = new Role("车间管理员", new String[]{"生产", "管理"});

        //添加产品
        productDao.addProduct(product);
        userDao.addUser(user);
        roleDao.addRole(role);

        //测试输出
        System.out.println(productDao);
        System.out.println(userDao);
        System.out.println(roleDao);
    }
}
