package com.springboottest.service;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class ScopeService {

    private String test;

    public void setTest(String test) {
        this.test = test;
    }

    public String getTest() {
        return test;
    }
}
