package com.zking.pojo;

import java.io.Serializable;

public class t_user implements Serializable {
    private  String  user_id;
    private String user_name;
    private String user_pwd;
    private Integer user_type;

    public t_user() {
    }

    public t_user(String user_id, String user_name, String user_pwd, Integer user_type) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_pwd = user_pwd;
        this.user_type = user_type;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_pwd() {
        return user_pwd;
    }

    public void setUser_pwd(String user_pwd) {
        this.user_pwd = user_pwd;
    }

    public Integer getUser_type() {
        return user_type;
    }

    public void setUser_type(Integer user_type) {
        this.user_type = user_type;
    }

    @Override
    public String toString() {
        return "t_user{" +
                "user_id=" + user_id +
                ", user_name=" + user_name +
                ", user_pwd=" + user_pwd +
                ", user_type=" + user_type +
                '}';
    }
}
