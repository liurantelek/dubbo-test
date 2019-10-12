package com.lr.dubbo.order;

import org.springframework.stereotype.Service;

/**
 * @author liuran
 * @email: liu_ran_programmer@163.com
 * @time 2019/10/11
 * @Description: 描述:
 */
@Service("orderService")
public class OrderServiceImpl implements IOrderService{
    @Override
    public DoOrderResponse doOrder(DoOrderRequest request) {
        System.out.println("resquest曾经来过："+request);
        DoOrderResponse response = new DoOrderResponse();
        response.setCode("1000");
        response.setMemo("处理成功");
        return response;
    }
}
