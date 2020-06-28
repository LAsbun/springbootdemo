package com.springboottest.dal;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by louxiu
 */
@Data
@Table(name = "country")
public class Country {

    @Id
    private Integer id;
    private String countryname;
    private String countrycode;

    //省略 getter 和 setter
}
