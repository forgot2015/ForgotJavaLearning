package schema.creation.abstractFactory.factory;


import schema.creation.abstractFactory.dao.product.IProductDao;
import schema.creation.abstractFactory.dao.product.OracleProductDao;
import schema.creation.abstractFactory.dao.role.IRoleDao;
import schema.creation.abstractFactory.dao.role.OracleRoleDao;
import schema.creation.abstractFactory.dao.user.IUserDao;
import schema.creation.abstractFactory.dao.user.OracleUserDao;

/**
 * Created by forgot on 2017/6/18.
 */
public class OracleDaoFactory implements IDaoFactory {
    @Override
    public IUserDao createUserDao() {
        return new OracleUserDao();
    }

    @Override
    public IProductDao createProductDao() {
        return new OracleProductDao();
    }

    @Override
    public IRoleDao createRoleDao() {
        return new OracleRoleDao();
    }

}
