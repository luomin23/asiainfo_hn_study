package com.asiainfo.chapter1.luomin.pattern.proxy.intercept;

import com.alibaba.druid.sql.visitor.SQLASTOutputVisitorUtils;

import javax.sound.midi.Soundbank;

/**
 * @author Luoo
 * @create 2017-08-25 10:50
 */

public class FirstAction extends Action {

    @Override
    void doGet() {
        System.out.println("it's a doGet method!!!");
    }

    @Override
    void doPost() {
        System.out.println("it's a doPost method!!!");

    }
}
