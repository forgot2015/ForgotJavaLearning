package schema.creation.abstractFactory.dao.role;

import schema.creation.abstractFactory.bean.Role;

/**
 * Created by forgot on 2017/6/18.
 */
public interface IRoleDao {
    void addRole(Role role);

    void removeRole(Role role);

    Role getRole(String roleName);

}
