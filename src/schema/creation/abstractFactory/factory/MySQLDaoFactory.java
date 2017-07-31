package schema.creation.abstractFactory.factory;

import schema.creation.abstractFactory.dao.product.IProductDao;
import schema.creation.abstractFactory.dao.product.MySQLProductDao;
import schema.creation.abstractFactory.dao.role.IRoleDao;
import schema.creation.abstractFactory.dao.role.MySQLRoleDao;
import schema.creation.abstractFactory.dao.user.IUserDao;
import schema.creation.abstractFactory.dao.user.MySQLUserDao;

/**
 * Created by forgot on 2017/6/18.
 */
public class MySQLDaoFactory implements IDaoFactory{

    @Override
    public IUserDao createUserDao() {
        return new MySQLUserDao();
    }

    @Override
    public IProductDao createProductDao() {
        return new MySQLProductDao();
    }

    @Override
    public IRoleDao createRoleDao() {
        return new MySQLRoleDao();
    }
}
