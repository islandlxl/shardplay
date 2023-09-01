package com.islandlxl.biz.aspect;

import com.islandlxl.biz.annotation.WR;
import com.islandlxl.biz.config.DynamicDataSource;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspectJ {

    @Before("within(com.islandlxl.biz.service.DemoShowService) && @annotation(wr)")
    public void before(JoinPoint point,WR wr){
        String value = wr.value();
        DynamicDataSource.currType.set(value);
        System.out.println(value);
    }

}
