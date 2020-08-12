package com.springboottest.mapper;

import org.junit.Test;

public class ThreadLocalTest {

    @Test
    public void testThreadLocalsetTwice() {
        for (int i = 0; i < 8; i++) {
            ThreadLocal<Integer> a = new ThreadLocal<>();
            a.set(i);
        }
        System.out.println("a.get()");
    }
}
