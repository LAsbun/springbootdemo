package com.springboottest.argsbeantest;

import org.springframework.stereotype.Service;

@Service
public class ArgvBean {

    private String xx;

    public ArgvBean(String xx) {
        this.xx = xx;
    }

    public ArgvBean() {

    }


    public String getXx() {
        return xx;
    }
}
