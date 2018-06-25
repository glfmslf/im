package com.yy.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.UUID;

/**
 * AUTHOR: youyu  工号：S37565
 * CREATED_DATE: 2018/6/22 18:07
 */
public class LogAspect {

    @Pointcut("@annotation(com.yy.conf.ServiceLog)")
    public void ctrlAspect(){

    }

    @Around("ctrlAspect()")
    public Object aroundExec(ProceedingJoinPoint proceedingJoinPoint){

        HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();

        try {
            MethodSignature methodSignature = (MethodSignature) proceedingJoinPoint.getSignature();
            Method method = methodSignature.getMethod();
            String ip = RequestUtil.getUserIp(request);
            String url = request.getRequestURI().trim();
            String reqNo = UUID.randomUUID().toString();
            proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return null;
    }

    @Around("serviceAspect()")
    public Object aroundExec2(ProceedingJoinPoint proceedingJoinPoint){

        try {
            proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return null;
    }
}
