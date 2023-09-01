package com.islandlxl.biz.config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import org.springframework.stereotype.Component;
import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Component
@Primary  //解决
public class DynamicDataSource extends AbstractRoutingDataSource {

    public static  ThreadLocal<String> currType=new ThreadLocal<>();

    @Autowired
    private DataSource dataSource00;// system

    @Autowired
    private DataSource dataSource01;// student


    @Autowired
    private DataSource dataSource02;// finance

    @Autowired
    private DataSource dataSource03;// biz



    @Override
    public void afterPropertiesSet() {
        Map<Object, Object> targetDataSources=new HashMap<>();
//        targetDataSources.put("system",dataSource00);
//        targetDataSources.put("student",dataSource01);
//        targetDataSources.put("finance",dataSource02);
//        targetDataSources.put("biz",dataSource03);
        targetDataSources.put("R",dataSource00);
        targetDataSources.put("w",dataSource00);
        super.setTargetDataSources(targetDataSources);
        super.setDefaultTargetDataSource(dataSource00);
        super.afterPropertiesSet();
    }

    @Override
    protected Object determineCurrentLookupKey() {
        return currType.get();
    }



}
