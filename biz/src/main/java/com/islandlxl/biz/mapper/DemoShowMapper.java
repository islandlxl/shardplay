package com.islandlxl.biz.mapper;


import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
public interface DemoShowMapper {



    List<Map<Object,Object>> getSystemList();

    int updateSystemList();

    List<Map<Object,Object>> getStudentList();

    List<Map<Object,Object>> getFinanceList();

    List<Map<Object,Object>> getBizList();


}
