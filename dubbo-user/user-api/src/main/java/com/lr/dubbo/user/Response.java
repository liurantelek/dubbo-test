package com.lr.dubbo.user;

import java.io.Serializable;

/**
 * @author liuran
 * @create 2019-10-13-8:49
 */
public class Response implements Serializable {
    private static final long serialVersionUID = -4929682873080501705L;

    private String code ;

    private String memo;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    @Override
    public String toString() {
        return "Response{" +
                "code='" + code + '\'' +
                ", memo='" + memo + '\'' +
                '}';
    }
}
