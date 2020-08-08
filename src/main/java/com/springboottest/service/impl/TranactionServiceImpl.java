package com.springboottest.service.impl;

import com.springboottest.dal.Country;
import com.springboottest.mapper.CountryMapper;
import com.springboottest.service.TranactionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
public class TranactionServiceImpl implements TranactionService {

    @Autowired
    CountryMapper countryMapper;

    @Override
    @Transactional
    public void transaction() {
        log.info("transaction");
        countryMapper.insert(new Country());
        int i = 1 / 0;
    }

    @Override
    public void unTransaction() {
        log.info("unTransaction");
        transaction();

    }
}
