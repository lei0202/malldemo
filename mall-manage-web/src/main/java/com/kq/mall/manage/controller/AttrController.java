package com.kq.mall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.kq.mall.bean.PmsBaseAttrInfo;
import com.kq.mall.bean.PmsBaseAttrValue;
import com.kq.mall.service.AttrService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin
public class AttrController {

    @Reference
    AttrService service;

    @RequestMapping("/attrInfoList")
    @ResponseBody
    public List<PmsBaseAttrInfo> attrInfoList(String catalog3Id) {
        List<PmsBaseAttrInfo> list = service.getAttrInfoList(catalog3Id);
        return list;
    }

    @RequestMapping("/getAttrValueList")
    @ResponseBody
    public List<PmsBaseAttrValue> getAttrValueList(String attrId) {
        List<PmsBaseAttrValue> list = service.getAttrValueList(attrId);
        return list;
    }

    @RequestMapping("/saveAttrInfo")
    @ResponseBody
    public String saveAttrInfo(@RequestBody PmsBaseAttrInfo pmsBaseAttrInfo) {
        service.save(pmsBaseAttrInfo);
        return "success";
    }
}
