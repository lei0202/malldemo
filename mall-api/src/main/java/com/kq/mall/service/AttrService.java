package com.kq.mall.service;

import com.kq.mall.bean.*;

import java.util.List;

/**
 * @author lilei
 */
public interface AttrService {

    List<PmsBaseAttrInfo> getAttrInfoList(String catalog3Id);

    List<PmsBaseAttrValue> getAttrValueList(String attrId);

    void save(PmsBaseAttrInfo pmsBaseAttrInfo);
}
