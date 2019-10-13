package com.lr.dubbo.controller;

import com.lr.dubbo.order.IOrderService;
import com.lr.dubbo.user.IUserService;
import com.lr.dubbo.user.UserLoginRequest;
import com.lr.dubbo.user.UserLoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * @author liuran
 * @create 2019-10-13-9:46
 */
@org.springframework.stereotype.Controller
@RequestMapping("/index")
public class UserController extends Controller {

    @Autowired
    private IOrderService orderService;

    @Autowired
    IUserService userService;

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(HttpServletRequest request,String loginname,String password){
        UserLoginRequest request1 = new UserLoginRequest ();
        request1.setName (loginname);
        request1.setPassword (password);
        UserLoginResponse response =  userService.login (request1);
        if(response.getCode () == "000000"){
            return "success";
        }else if(response.getCode () == "100000"){
            return "false";
        }
        return "error";
    }
}
