package com.domain;

import java.io.Serializable;

//Serializable接口意义 是一个标记性接口 没有任何抽象方法
//只要一个类实现了这个接口 那么就表示这个类的对象可以被序列化
public class User implements Serializable {
    private static final long serialVersionUID = 111L;
    private String username;
    private  String password; //不被序列化 transient 瞬态关键字 不会写入

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
