package com.springboottest.mapper;

import com.springboottest.dal.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestAutoConfigurationAnnotion {

    @Autowired
    Person person;

    @Test
    public void testPersonValue() {
        System.out.println(person.getName());
    }
}
