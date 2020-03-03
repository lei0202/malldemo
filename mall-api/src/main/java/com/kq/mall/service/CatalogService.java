package com.kq.mall.service;

import com.kq.mall.bean.*;

import java.util.List;

/**
 * @author lilei
 */
public interface CatalogService {

    List<PmsBaseCatalog1> getCatalog1();

    List<PmsBaseCatalog2> getCatalog2(String id);

    List<PmsBaseCatalog3> getCatalog3(String catalog2Id);

}
