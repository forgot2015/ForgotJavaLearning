package schema.creation.abstractFactory.factory;

import schema.creation.abstractFactory.dao.product.IProductDao;
import schema.creation.abstractFactory.dao.role.IRoleDao;
import schema.creation.abstractFactory.dao.user.IUserDao;

/**
 * Created by forgot on 2017/6/18.
 */
public interface IDaoFactory {
    IUserDao createUserDao();
    IProductDao createProductDao();
    IRoleDao createRoleDao();
}
