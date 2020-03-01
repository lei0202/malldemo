package com.kq.mall.service.impl;

import com.kq.mall.bean.UmsMemberReceiveAddress;
import com.kq.mall.mapper.UserMapper;
import com.kq.mall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @author lilei
 */
@Service
public class UserServiceImpl implements UserService {

    @SuppressWarnings("all")
    @Autowired
    UserMapper mapper;

    public List getAllUser() {
        return mapper.selectAll();
    }

    public List<UmsMemberReceiveAddress> getAddressByMemberId(String memberId) {
        return null;
    }
}
