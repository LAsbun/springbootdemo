package com.springboottest.autoconfiguration.conditionpac;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class MyCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {

        //org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type 'com.springboottest.autoconfiguration.conditionpac.ConditionBean' available
//        return false;

        return true;
    }
}
