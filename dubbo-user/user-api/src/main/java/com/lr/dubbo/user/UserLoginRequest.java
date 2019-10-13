package com.lr.dubbo.user;

import java.io.Serializable;

/**
 * @author liuran
 * @create 2019-10-13-8:53
 */
public class UserLoginRequest implements Serializable {
    private static final long serialVersionUID = 3068751186011441245L;

    private String name;

    private String password;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserLoginRequest{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
