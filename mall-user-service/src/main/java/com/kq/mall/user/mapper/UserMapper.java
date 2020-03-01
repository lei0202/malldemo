package com.kq.mall.user.mapper;

import com.kq.mall.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author lilei
 */
public interface UserMapper extends Mapper<UmsMember>{

    List<UmsMember> selectAllUser();

}
