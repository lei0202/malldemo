package com.kq.mall.manage.mapper;

import com.kq.mall.bean.PmsBaseCatalog1;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface PmsBaseCatalog1Mapper extends Mapper<PmsBaseCatalog1> {

    @Override
    List<PmsBaseCatalog1> selectAll();
}
