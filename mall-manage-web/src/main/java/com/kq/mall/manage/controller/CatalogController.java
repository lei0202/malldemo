package com.kq.mall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.kq.mall.bean.*;
import com.kq.mall.service.CatalogService;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author lilei
 */
@Controller
@CrossOrigin
public class CatalogController {

    @Reference
    CatalogService catalogService;

    @RequestMapping("/getCatalog1")
    @ResponseBody
    public List<PmsBaseCatalog1> getCatalog1() {
        List<PmsBaseCatalog1> list = catalogService.getCatalog1();
        return list;
    }

    @RequestMapping("/getCatalog2")
    @ResponseBody
    public List<PmsBaseCatalog2> getCatalog2(String catalog1Id) {
        List<PmsBaseCatalog2> list = catalogService.getCatalog2(catalog1Id);
        return list;
    }

    @RequestMapping("/getCatalog3")
    @ResponseBody
    public List<PmsBaseCatalog3> getCatalog3(String catalog2Id) {
        List<PmsBaseCatalog3> list = catalogService.getCatalog3(catalog2Id);
        return list;
    }


}
