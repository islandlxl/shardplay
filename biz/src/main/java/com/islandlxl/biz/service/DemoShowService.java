package com.islandlxl.biz.service;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.islandlxl.biz.annotation.WR;
import com.islandlxl.biz.mapper.DemoShowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoShowService implements IDemoShowService{

    @Autowired
    DemoShowMapper demoShowMapper;


    @WR("W")
    public List selectSystem() {
        return demoShowMapper.getSystemList();
    }

    @WR("R")
    public int updateSystemList() {
        return demoShowMapper.updateSystemList();
    }
}
