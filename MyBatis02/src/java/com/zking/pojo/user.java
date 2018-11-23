package com.zking.pojo;

import java.io.Serializable;

public class user implements Serializable{
    private String uid;
    private String uname;

    public user() {
    }

    public user(String uid, String uname) {
        this.uid = uid;
        this.uname = uname;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUid() {
        return uid;
    }

    public String getUname() {
        return uname;
    }
}
