package com.springboottest.autoconfiguration.importpac;

import com.springboottest.autoconfiguration.ImportClassByBeanDifinitionRegister;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class CustomBeanDifinitionRegister implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(ImportClassByBeanDifinitionRegister.class);
        registry.registerBeanDefinition("ImportClassByBeanDifinitionRegister", rootBeanDefinition);
    }
}
