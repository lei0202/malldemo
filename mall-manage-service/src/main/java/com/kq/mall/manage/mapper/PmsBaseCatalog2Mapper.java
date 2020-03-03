package com.kq.mall.manage.mapper;

import com.kq.mall.bean.PmsBaseCatalog2;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface PmsBaseCatalog2Mapper extends Mapper<PmsBaseCatalog2> {

    List<PmsBaseCatalog2> selectById(String id);
}
