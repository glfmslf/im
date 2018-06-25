package com.yy.common;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * AUTHOR: youyu  工号：S37565
 * CREATED_DATE: 2018/6/25 10:48
 */
public class BeanCondition implements Condition {
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        return false;
    }
}
