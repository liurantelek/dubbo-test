package com.lr.dubbo.order.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author liuran
 * @create 2019-10-13-22:09
 */
public class OrderDaoImpl implements OrderDao {
    @Autowired
    JdbcTemplate orderTemplate;

    @Override
    public void insertOrder() {
        orderTemplate.execute ("INSERT INTO ORDER (status,price,order_time) VALUES (1,2,3)");
    }
}
