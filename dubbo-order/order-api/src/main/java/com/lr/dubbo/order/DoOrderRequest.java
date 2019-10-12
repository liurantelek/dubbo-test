package com.lr.dubbo.order;

import java.io.Serializable;

/**
 * @author liuran
 * @email: liu_ran_programmer@163.com
 * @time 2019/10/11
 * @Description: 描述:
 */
public class DoOrderRequest implements Serializable {

    private static final long serialVersionUID = -7571086539550647072L;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DoOrderRequest{" +
                "name='" + name + '\'' +
                '}';
    }
}
