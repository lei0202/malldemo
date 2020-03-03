package com.kq.mall.manage.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.kq.mall.bean.*;
import com.kq.mall.manage.mapper.*;
import com.kq.mall.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class CatalogServiceImpl implements CatalogService {

    @Autowired
    PmsBaseCatalog1Mapper pmsBaseCatalog1Mapper;

    @Autowired
    PmsBaseCatalog2Mapper pmsBaseCatalog2Mapper;

    @Autowired
    PmsBaseCatalog3Mapper pmsBaseCatalog3Mapper;


    @Override
    public List<PmsBaseCatalog1> getCatalog1() {
        return pmsBaseCatalog1Mapper.selectAll();
    }
    @Override
    public List<PmsBaseCatalog2> getCatalog2(String id) {
        return pmsBaseCatalog2Mapper.selectById(id);
    }
    @Override
    public List<PmsBaseCatalog3> getCatalog3(String catalog2Id) {
        return pmsBaseCatalog3Mapper.selectById(catalog2Id);
    }


}
