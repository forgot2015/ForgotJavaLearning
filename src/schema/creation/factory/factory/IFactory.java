package schema.creation.factory.factory;

import schema.creation.factory.dao.IUserDao;

/**
 * Created by forgot on 2017/6/18.
 */
public interface IFactory {
    IUserDao createUserDao();
}
