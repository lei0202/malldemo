package com.kq.mall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.kq.mall.bean.PmsBaseAttrInfo;
import com.kq.mall.bean.PmsBaseAttrValue;
import com.kq.mall.manage.mapper.PmsBaseAttrInfoMapper;
import com.kq.mall.manage.mapper.PmsBaseAttrValueMapper;
import com.kq.mall.service.AttrService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class AttrServiceImpl implements AttrService {

    @Autowired
    PmsBaseAttrInfoMapper InfoMapper;

    @Autowired
    PmsBaseAttrValueMapper ValueMapper;

    @Override
    public List<PmsBaseAttrInfo> getAttrInfoList(String catalog3Id) {
        return InfoMapper.selectById(catalog3Id);
    }

    @Override
    public List<PmsBaseAttrValue> getAttrValueList(String attrId) {
        return ValueMapper.selectById(attrId);
    }

    @Override
    public void save(PmsBaseAttrInfo pmsBaseAttrInfo) {
        String id = pmsBaseAttrInfo.getId();
        List<PmsBaseAttrValue> valueList = pmsBaseAttrInfo.getAttrValueList();
        String newId;

        // 将数据库已有的value和value列表进行比对（根据attr_id来找已有的value）
        if(id!=null) {
            List<PmsBaseAttrValue> valueListNow = ValueMapper.findExistValue(id);
            newId = id;
            for (PmsBaseAttrValue value : valueListNow) {
                if(!valueList.contains(value)) {
                    ValueMapper.delete(value);
                }
            }
        }
        else{
            InfoMapper.saveIfNotExist(pmsBaseAttrInfo);
            newId = pmsBaseAttrInfo.getId();
        }
        if(valueList != null) {
            for (PmsBaseAttrValue value : valueList) {
                String vid = value.getId();
                String vname = value.getValueName();
                String aid = newId;
                String vis = value.getIsEnabled();
                if(vid==null){
                    ValueMapper.save(vid,vname,aid,vis);
                }
                else
                {
                    ValueMapper.update(vid,vname,aid,vis);
                }
            }
        }
    }
}
