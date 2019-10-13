package com.lr.dubbo.user;

import com.lr.dubbo.validator.UserValidator;
import org.springframework.stereotype.Service;

/**
 * @author liuran
 * @email: liu_ran_programmer@163.com
 * @time 2019/10/12
 * @Description: 描述:
 */
@Service("userService")
public class UserServiceImpl implements IUserService {


    @Override
    public UserLoginResponse login(UserLoginRequest request) {

        UserLoginResponse response = new UserLoginResponse ();

        if(UserValidator.chekcUserLoginRequest (request)){
            response.setCode ("000000");
            response.setMemo ("成功");
            return response;
        }
        response.setCode ("100000");
        response.setMemo ("失败");
        return response;
    }
}
