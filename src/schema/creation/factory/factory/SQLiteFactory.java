package schema.creation.factory.factory;

import schema.creation.factory.dao.IUserDao;
import schema.creation.factory.dao.SQLiteUserDao;

/**
 * Created by forgot on 2017/6/18.
 */
public class SQLiteFactory implements IFactory {
    @Override
    public IUserDao createUserDao() {
        return new SQLiteUserDao();
    }
}
