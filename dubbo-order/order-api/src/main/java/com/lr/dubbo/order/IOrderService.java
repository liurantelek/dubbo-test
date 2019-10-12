package com.lr.dubbo.order;

/**
 * @author liuran
 * @email: liu_ran_programmer@163.com
 * @time 2019/10/11
 * @Description: 描述:
 */
public interface IOrderService {

    /**
     * 下单操作
     * @param request
     * @return
     */
    DoOrderResponse  doOrder(DoOrderRequest request);
}
