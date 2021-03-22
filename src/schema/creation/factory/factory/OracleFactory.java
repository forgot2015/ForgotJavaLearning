package schema.creation.factory.factory;

import schema.creation.factory.dao.IUserDao;
import schema.creation.factory.dao.OracleUserDao;

/**
 * Created by forgot on 2017/6/18.
 */
public class OracleFactory implements IFactory {
    @Override
    public IUserDao createUserDao() {
        return new OracleUserDao();
    }
}
