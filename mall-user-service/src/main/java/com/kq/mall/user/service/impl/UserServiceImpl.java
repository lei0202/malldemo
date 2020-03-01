package com.kq.mall.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.kq.mall.bean.UmsMember;
import com.kq.mall.bean.UmsMemberReceiveAddress;
import com.kq.mall.service.UserService;
import com.kq.mall.user.mapper.UmsMemberReceiveAddressMapper;
import com.kq.mall.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

/**
 * @author lilei
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    @Override
    public List<UmsMember> getAllUser() {

        //userMapper.selectAllUser()
        List<UmsMember> umsMembers = userMapper.selectAll();;

        return umsMembers;
    }

    @Override
    public List<UmsMemberReceiveAddress> getAddressByMemberId(String memberId) {

        // 封装的参数对象
        UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
        umsMemberReceiveAddress.setMemberId(memberId);
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);
        return umsMemberReceiveAddresses;
    }
}
