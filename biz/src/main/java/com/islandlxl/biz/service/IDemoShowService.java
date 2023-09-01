package com.islandlxl.biz.service;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.islandlxl.biz.mapper.DemoShowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IDemoShowService {


    List selectSystem();


    int updateSystemList();
}
