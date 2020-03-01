package com.kq.mall.service;


import com.kq.mall.bean.UmsMember;
import com.kq.mall.bean.UmsMemberReceiveAddress;
import java.util.List;

/**
 * @author lilei
 */
public interface UserService {
    List<UmsMember> getAllUser();


    List<UmsMemberReceiveAddress> getAddressByMemberId(String memberId);
}
