package com.example.demo.bean;

import java.util.List;

public class RoleObject {

    private String roleName;
    private Float roleLabel;
    List<ACLObject> acls;

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Float getRoleLabel() {
        return roleLabel;
    }

    public void setRoleLabel(Float roleLabel) {
        this.roleLabel = roleLabel;
    }

    public List<ACLObject> getAcls() {
        return acls;
    }

    public void setAcls(List<ACLObject> acls) {
        this.acls = acls;
    }
}
