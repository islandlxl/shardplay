package com.islandlxl.biz.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import com.islandlxl.biz.plugin.MybatisDynamicPlugin;
import com.islandlxl.biz.support.IslandDruidProperties;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Plugin;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.SQLException;

@Configuration
@EnableConfigurationProperties(IslandDruidProperties.class)
@MapperScan("com.islandlxl.biz.mapper")
public class DataSourceConfig {

    @Autowired
    private IslandDruidProperties islandDruidProperties;

    @ConfigurationProperties(prefix = "spring.datasource.druid00")
    @Bean
    public DataSource dataSource00() throws SQLException {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName(islandDruidProperties.getDriverClassName());
        druidDataSource.setUrl(islandDruidProperties.getDruid00jdbcUrl());
        druidDataSource.setUsername(islandDruidProperties.getDruid00username());
        druidDataSource.setPassword(islandDruidProperties.getDruid00password());
        return druidDataSource;
    }



    @ConfigurationProperties(prefix = "spring.datasource.druid01")
    @Bean
    public DataSource dataSource01() throws SQLException {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName(islandDruidProperties.getDriverClassName());
        druidDataSource.setUrl(islandDruidProperties.getDruid01jdbcUrl());
        druidDataSource.setUsername(islandDruidProperties.getDruid01username());
        druidDataSource.setPassword(islandDruidProperties.getDruid01password());
        return druidDataSource;
    }



    @ConfigurationProperties(prefix = "spring.datasource.druid02")
    @Bean
    public DataSource dataSource02() throws SQLException {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName(islandDruidProperties.getDriverClassName());
        druidDataSource.setUrl(islandDruidProperties.getDruid02jdbcUrl());
        druidDataSource.setUsername(islandDruidProperties.getDruid02username());
        druidDataSource.setPassword(islandDruidProperties.getDruid02password());
        return druidDataSource;
    }



    @ConfigurationProperties(prefix = "spring.datasource.druid03")
    @Bean
    public DataSource dataSource03() throws SQLException {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName(islandDruidProperties.getDriverClassName());
        druidDataSource.setUrl(islandDruidProperties.getDruid03jdbcUrl());
        druidDataSource.setUsername(islandDruidProperties.getDruid03username());
        druidDataSource.setPassword(islandDruidProperties.getDruid03password());
        return druidDataSource;
    }


    @Bean
    public Interceptor mybatisDynamicPlugin(){
        return new MybatisDynamicPlugin();
    }

}
