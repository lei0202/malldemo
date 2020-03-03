package com.kq.mall.manage.mapper;

import com.kq.mall.bean.PmsBaseAttrInfo;

import java.util.List;

/**
 * @author lilei
 */
public interface PmsBaseAttrInfoMapper {
    List<PmsBaseAttrInfo> selectById(String id);

    int saveIfNotExist(PmsBaseAttrInfo pmsBaseAttrInfo);

//    void update(String id, String attrName, String catalog3Id, String isEnabled);
}
