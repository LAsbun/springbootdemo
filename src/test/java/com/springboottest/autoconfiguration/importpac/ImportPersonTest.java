package com.springboottest.autoconfiguration.importpac;

import com.springboottest.autoconfiguration.ImportClass;
import com.springboottest.autoconfiguration.ImportClassByBeanDifinitionRegister;
import com.springboottest.autoconfiguration.ImportClassBySelector;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ImportPersonTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ImportPerson.class);
        ImportClass bean = context.getBean(ImportClass.class);
        bean.sayHi();
    }

    @Test
    public void testImportSelector() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ImportPerson.class);
        ImportClass bean = context.getBean(ImportClass.class);
        ImportClassBySelector bean1 = context.getBean(ImportClassBySelector.class);
        bean.sayHi();
        bean1.sayHi();
    }

    @Test
    public void testImportByRegister() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ImportPerson.class);
        ImportClassByBeanDifinitionRegister bean = context.getBean(ImportClassByBeanDifinitionRegister.class);
        bean.sayHi();
    }
}