package com.springboottest.mapper;

import com.github.pagehelper.PageHelper;
import com.springboottest.dal.Country;
import com.springboottest.mapper.CountryMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CountryMapperTest {

    @Resource
    CountryMapper countryMapper;

    @Test
    public void testMapper() {
        PageHelper.startPage(1, 2);

        Example example = new Example(Country.class);

        Example.Criteria criteria = example.createCriteria();
        criteria.andGreaterThan("id", 1);

        List<Country> countries = countryMapper.selectByExample(example);

        System.out.println("xx");
    }
}