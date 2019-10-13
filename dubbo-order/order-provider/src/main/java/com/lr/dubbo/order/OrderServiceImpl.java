package com.lr.dubbo.order;

import com.atomikos.icatch.jta.UserTransactionImp;
import com.lr.dubbo.order.dao.OrderDao;
import com.lr.dubbo.user.IUserService;
import com.lr.dubbo.user.UserLoginRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.jta.JtaTransactionManager;

import javax.transaction.*;

/**
 * @author liuran
 * @email: liu_ran_programmer@163.com
 * @time 2019/10/11
 * @Description: 描述:
 */
@Service("orderService")
public class OrderServiceImpl implements IOrderService{

    @Autowired
    JtaTransactionManager springTransactionManager;

    @Autowired
    OrderDao orderDao;

    @Autowired
    IUserService userService;

    @Override
    public DoOrderResponse doOrder(DoOrderRequest request) {
        try {
            UserTransaction userTransaction = springTransactionManager.getUserTransaction ();
            try {
                userTransaction.begin ();
            } catch (SystemException e) {
                e.printStackTrace ();
            }
            UserLoginRequest request1 = new UserLoginRequest ();
             orderDao.insertOrder ();
            userService.login (request1);
            try {
                userTransaction.commit ();
            } catch (RollbackException e) {
                try {
                    userTransaction.rollback ();
                } catch (SystemException e1) {
                    e1.printStackTrace ();
                }
            } catch (HeuristicMixedException e) {
                e.printStackTrace ();
            } catch (HeuristicRollbackException e) {
                e.printStackTrace ();
            } catch (SystemException e) {
                e.printStackTrace ();
            }
        } catch (NotSupportedException e) {
            e.printStackTrace ();
        }

        System.out.println("resquest曾经来过："+request);
        DoOrderResponse response = new DoOrderResponse();
        response.setCode("1000");
        response.setMemo("处理成功");
        return response;
    }
}
