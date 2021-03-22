package schema.creation.abstractFactory.bean;

import java.util.Arrays;

/**
 * Created by forgot on 2017/6/18.
 */
public class Role {
    private String roleName;//角色名，如管理员，财务
    private String[] permissions;//角色权限，如增加，删除

    public Role(String roleName, String[] permissions) {
        this.roleName = roleName;
        this.permissions = permissions;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String[] getPermissions() {
        return permissions;
    }

    public void setPermissions(String[] permissions) {
        this.permissions = permissions;
    }

    @Override
    public String toString() {
        return "Role{" +
                "roleName='" + roleName + '\'' +
                ", permissions=" + Arrays.toString(permissions) +
                '}';
    }


}
