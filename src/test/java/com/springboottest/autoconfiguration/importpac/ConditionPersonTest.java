package com.springboottest.autoconfiguration.importpac;

import com.springboottest.autoconfiguration.conditionpac.ConditionBean;
import com.springboottest.autoconfiguration.conditionpac.ConditionPerson;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConditionPersonTest {
    @Test
    public void testConditon() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionPerson.class);
        ConditionBean bean = context.getBean(ConditionBean.class);
        bean.sayHi();
    }
}
