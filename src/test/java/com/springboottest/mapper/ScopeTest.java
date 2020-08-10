package com.springboottest.mapper;

import com.springboottest.service.ScopeService;
import com.springboottest.service.ScopeService2;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class ScopeTest {

    @Autowired
    private ScopeService scopeService;

    @Autowired
    private ScopeService2 scopeService2;

    @Test
    public void testSingleton() {
        scopeService.setTest("xx");
        log.info("[test] :{}", scopeService.getTest());
        scopeService2.print();
    }

    @Test
    public void testProto() {
        scopeService.setTest("xx");
        log.info("[test] :{}", scopeService.getTest());
        scopeService2.print();
    }
}
