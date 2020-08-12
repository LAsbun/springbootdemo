package com.springboottest.dal;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "person")
@Setter
@Getter
public class Person {

    @Value("xxx") // 与ConfigurationProperties 同时存在，是以application 为准
    private String name;

    private String id;
}
