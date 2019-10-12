package com.lr.dubbo.order;

import org.springframework.stereotype.Service;

/**
 * @author liuran
 * @email: liu_ran_programmer@163.com
 * @time 2019/10/12
 * @Description: 描述:
 */
@Service("orderQueryService")
public class OrderQueryImpl implements IOrderQueryService {

    @Override
    public String doQuery(String param) {
        System.out.println(param+"来看过菲菲");
        return "hello feifei ";
    }
}
