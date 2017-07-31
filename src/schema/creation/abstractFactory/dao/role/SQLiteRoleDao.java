package schema.creation.abstractFactory.dao.role;

import schema.creation.abstractFactory.bean.Role;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by forgot on 2017/6/18.
 */
public class SQLiteRoleDao implements IRoleDao {
    Map<String,Role> map =new HashMap<>();
    @Override
    public void addRole(Role role) {
        map.put(role.getRolename(),role);
    }

    @Override
    public void removeRole(Role role) {
        map.remove(role.getRolename());
    }

    @Override
    public Role getRole(String roleName) {
        return map.get(roleName);
    }
}
