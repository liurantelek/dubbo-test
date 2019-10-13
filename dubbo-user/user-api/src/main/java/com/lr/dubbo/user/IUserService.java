package com.lr.dubbo.user;

/**
 * @author liuran
 * @email: liu_ran_programmer@163.com
 * @time 2019/10/12
 * @Description: 描述:
 */
public interface IUserService {

    UserLoginResponse login (UserLoginRequest request);
}
