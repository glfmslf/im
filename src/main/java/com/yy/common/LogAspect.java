package com.yy.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Pointcut;

/**
 * AUTHOR: youyu  工号：S37565
 * CREATED_DATE: 2018/6/22 18:07
 */
public class LogAspect {

    @Pointcut("com.yy.ctrl..*(*)")
    public void ctrlAspect(){

    }

    @Pointcut("com.yy.service..*(*)")
    public void serviceAspect(){

    }

    @Around("ctrlAspect()")
    public Object aroundExec(ProceedingJoinPoint proceedingJoinPoint){

        try {
            proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return null;
    }

    @Around("serviceAspect()")
    public Object aroundExec2(ProceedingJoinPoint proceedingJoinPoint){

        return null;
    }
}
