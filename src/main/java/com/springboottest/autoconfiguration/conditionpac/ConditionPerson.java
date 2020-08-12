package com.springboottest.autoconfiguration.conditionpac;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;

@Conditional(MyCondition.class)
public class ConditionPerson {

    @Bean
    public ConditionBean conditionBean() {
        return new ConditionBean();
    }
}
