package com.example.demo.bean;

import java.util.List;

public class ACLObject {

    private String aclName;
    private Float aclVersion;
    List<ACLPermission> aclPermissions;

    public static ACLObject getInstance(String aclID){
        return null;
    }

    public String getAclName() {
        return aclName;
    }

    public void setAclName(String aclName) {
        this.aclName = aclName;
    }

    public Float getAclVersion() {
        return aclVersion;
    }

    public void setAclVersion(Float aclVersion) {
        this.aclVersion = aclVersion;
    }

    public List<ACLPermission> getAclPermissions() {
        return aclPermissions;
    }

    public void setAclPermissions(List<ACLPermission> aclPermissions) {
        this.aclPermissions = aclPermissions;
    }
}
