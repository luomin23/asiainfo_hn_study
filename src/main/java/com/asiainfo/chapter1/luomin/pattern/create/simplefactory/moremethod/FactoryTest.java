package com.asiainfo.chapter1.luomin.pattern.create.simplefactory.moremethod;

import com.asiainfo.chapter1.luomin.pattern.create.simplefactory.normal.Sender;

/**
 * @author Luoo
 * @create 2017-08-09 10:40
 */

public class FactoryTest {

    public static void main(String[] args) {
        SendFactory factory = new SendFactory();
        Sender sender = factory.produceMail();
        sender.Send();
    }
}
