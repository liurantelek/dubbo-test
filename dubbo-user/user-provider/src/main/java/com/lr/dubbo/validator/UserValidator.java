package com.lr.dubbo.validator;

import com.lr.dubbo.user.UserLoginRequest;
import org.springframework.util.StringUtils;

/**
 * @author liuran
 * @create 2019-10-13-8:58
 */
public class UserValidator {

    public static boolean chekcUserLoginRequest(UserLoginRequest request){
        if(StringUtils.isEmpty (request.getName ())||StringUtils.isEmpty (request.getPassword ())){
            return false;
        }
        return true;
    }
}
