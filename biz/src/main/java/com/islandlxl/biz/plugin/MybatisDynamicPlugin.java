package com.islandlxl.biz.plugin;

import com.islandlxl.biz.config.DynamicDataSource;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.SqlCommandType;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;

import java.util.Properties;

/**
 * 对Executor对象的update和query方法进行增强
 */
@Intercepts({
        @Signature(type = Executor.class,method = "update", args = {MappedStatement.class, Object.class}),
        @Signature(type = Executor.class,method = "query", args = { MappedStatement.class, Object.class,
                RowBounds.class, ResultHandler.class })})
public class MybatisDynamicPlugin implements Interceptor {


    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        Object[] args = invocation.getArgs();
        MappedStatement ms=(MappedStatement)args[0];
        //读方法
        if (ms.getSqlCommandType().equals(SqlCommandType.SELECT)){
            DynamicDataSource.currType.set("R");
        }else {
            DynamicDataSource.currType.set("W");
        }
        return invocation.proceed();
    }

    @Override
    public Object plugin(Object target) {
        System.out.println("包装的对象: " + target.toString());
        return Plugin.wrap(target, this);
    }

    @Override
    public void setProperties(Properties properties) {
        System.out.println("读取到配置文件的参数是：" + properties);

    }
}
