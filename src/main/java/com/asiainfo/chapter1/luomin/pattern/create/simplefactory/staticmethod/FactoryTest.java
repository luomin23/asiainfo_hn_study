package com.asiainfo.chapter1.luomin.pattern.create.simplefactory.staticmethod;

import com.asiainfo.chapter1.luomin.pattern.create.simplefactory.normal.Sender;

/**
 * @author Luoo
 * @create 2017-08-09 10:43
 */

public class FactoryTest {

    public static void main(String[] args) {
        Sender sender = SendFactory.produceMail();
        sender.Send();
    }
}