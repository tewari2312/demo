package com.example.demo.bean;

import java.util.List;

public class UserObject {

    private String userName;
    private String userID;
    List<RoleObject> roles;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public List<RoleObject> getRoles() {
        return roles;
    }

    public void setRoles(List<RoleObject> roles) {
        this.roles = roles;
    }
}
