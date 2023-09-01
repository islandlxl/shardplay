# shardplay
基于springboot的多数据源实现策略，支持分库分表，读写分离 
    1.实现dataSource接口实现多数据源 
    2.继承AbstractRoutingDataSource实现多数据源策略 
    3.使用mybatis插件，实现interceptor接口实现读写分离 
    4.aop+注解方式实现多数据源策略 
    5.dynamicDataSource框架实现多数据源策略
