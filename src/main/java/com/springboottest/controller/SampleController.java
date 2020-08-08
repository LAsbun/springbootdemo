package com.springboottest.controller;

import com.springboottest.dal.Country;
import com.springboottest.mapper.CountryMapper;
import com.springboottest.service.TranactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class SampleController {

    @Autowired
    CountryMapper mapper;

    @Autowired
    TranactionService tranactionService;

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }
//
//    public static void main(String[] args) throws Exception {
//        SpringApplication.run(SampleController.class, args);
//    }

    @GetMapping("/test")
    String test() {
        tranactionService.unTransaction();
        return "";
    }

    @Transactional
    void delete() {
        mapper.delete(new Country());
        int i = 1 / 0;
    }

    @Transactional
    void insert() {
        mapper.insert(new Country());
        int i = 1 / 0;
    }
}