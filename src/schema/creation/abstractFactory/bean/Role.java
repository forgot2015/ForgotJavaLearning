package schema.creation.abstractFactory.bean;

import java.util.Arrays;

/**
 * Created by forgot on 2017/6/18.
 */
public class Role {
    private String rolename;//角色名，如管理员，财务
    private String[] permission;//角色权限，如增加，删除

    public Role(String rolename, String[] permission) {
        this.rolename = rolename;
        this.permission = permission;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public String[] getPermission() {
        return permission;
    }

    public void setPermission(String[] permission) {
        this.permission = permission;
    }

    @Override
    public String toString() {
        return "Role{" +
                "rolename='" + rolename + '\'' +
                ", permission=" + Arrays.toString(permission) +
                '}';
    }


}
