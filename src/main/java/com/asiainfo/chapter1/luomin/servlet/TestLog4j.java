package com.asiainfo.chapter1.luomin.servlet;


import org.apache.log4j.Logger;

/**
 * @author Luoo
 * @create 2017-08-17 18:21
 */

public class TestLog4j {
    private static final Logger LOG = Logger.getLogger(TestLog4j.class);

    public static void main(String[] args) {
        LOG.info("this is log");
    }
}

