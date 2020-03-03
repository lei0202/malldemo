package com.kq.mall.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.kq.mall.bean.UmsMember;
import com.kq.mall.bean.UmsMemberReceiveAddress;
import com.kq.mall.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

/**
 * @author lilei
 */
@Controller
public class UserController {

    @Reference
    UserService userService;

    @RequestMapping("getAddressByMemberId")
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId){

        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = userService.getAddressByMemberId(memberId);

        return umsMemberReceiveAddresses;
    }


    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){

        List<UmsMember> umsMembers = userService.getAllUser();
        return umsMembers;
    }

    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "hello user";
    }



}
