package com.kq.mall.manage.mapper;

import com.kq.mall.bean.PmsBaseAttrValue;

import java.util.List;

public interface PmsBaseAttrValueMapper {

    List<PmsBaseAttrValue> selectById(String attrId);

    void save(String vid, String vname, String aid, String vis);

    void update(String vid, String vname, String aid, String vis);

    List<PmsBaseAttrValue> findExistValue(String id);

    void delete(PmsBaseAttrValue value);
}

