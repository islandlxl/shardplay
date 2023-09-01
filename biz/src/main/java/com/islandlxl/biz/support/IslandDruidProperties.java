package com.islandlxl.biz.support;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "spring.datasource")
public class IslandDruidProperties {
    private String driverClassName;
    private int initialPoolSize;
    private int minPoolSize;
    private int maxPoolSize;


    private String druid00username;
    private String druid00password;
    private String druid00jdbcUrl;


    private String druid01username;
    private String druid01password;
    private String druid01jdbcUrl;


    private String druid02username;
    private String druid02password;
    private String druid02jdbcUrl;



    private String druid03username;
    private String druid03password;
    private String druid03jdbcUrl;



}
