package com.islandlxl.biz.controller;

import com.alibaba.fastjson.JSON;
import com.islandlxl.biz.config.DynamicDataSource;
import com.islandlxl.biz.mapper.DemoShowMapper;
import com.islandlxl.biz.service.DemoShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DemoShowController {

    @Autowired
    DemoShowService demoShowService;

    @Autowired
    private DemoShowMapper demoShowMapper;

    @GetMapping("/system")
    public String system() {
     //   DynamicDataSource.currType.set("system");
        List systemList = demoShowMapper.getSystemList();
        return JSON.toJSONString(systemList);
    }

    @GetMapping("/student")
    public String student() {
       DynamicDataSource.currType.set("student");
        List list = demoShowMapper.getStudentList();
        return JSON.toJSONString(list);
    }

    @GetMapping("/finance")
    public String finance() {
        DynamicDataSource.currType.set("finance");
        List list = demoShowMapper.getFinanceList();
        return JSON.toJSONString(list);
    }

    @GetMapping("/biz")
    public String biz() {
        DynamicDataSource.currType.set("biz");
        List list = demoShowMapper.getBizList();
        return JSON.toJSONString(list);
    }


    @GetMapping("/select")
    public String selectSystem() {
        List list = demoShowService.selectSystem();
        return JSON.toJSONString(list);
    }


    @GetMapping("/update")
    public String updateSystemList() {
        int ans = demoShowService.updateSystemList();
        return JSON.toJSONString(ans);
    }
}
