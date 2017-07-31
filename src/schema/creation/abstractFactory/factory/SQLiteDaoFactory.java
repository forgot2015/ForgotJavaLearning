package schema.creation.abstractFactory.factory;

import schema.creation.abstractFactory.dao.product.IProductDao;
import schema.creation.abstractFactory.dao.product.SQLiteProductDao;
import schema.creation.abstractFactory.dao.role.IRoleDao;
import schema.creation.abstractFactory.dao.role.SQLiteRoleDao;
import schema.creation.abstractFactory.dao.user.IUserDao;
import schema.creation.abstractFactory.dao.user.SQLiteUserDao;

/**
 * Created by forgot on 2017/6/18.
 */
public class SQLiteDaoFactory implements IDaoFactory {
    @Override
    public IUserDao createUserDao() {
        return new SQLiteUserDao();
    }

    @Override
    public IProductDao createProductDao() {
        return new SQLiteProductDao();
    }

    @Override
    public IRoleDao createRoleDao() {
        return new SQLiteRoleDao();
    }
}
