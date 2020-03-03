package com.kq.mall.manage.mapper;

import com.kq.mall.bean.PmsBaseCatalog3;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface PmsBaseCatalog3Mapper extends Mapper<PmsBaseCatalog3> {

    List<PmsBaseCatalog3> selectById(String id);
}
