package com.springboottest.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ScopeService2 {

    @Autowired
    ScopeService scopeService;

    public void print() {
        log.info("[{}]", scopeService.getTest());
    }
}
