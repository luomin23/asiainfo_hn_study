package com.asiainfo.chapter1.luomin.pattern.create.simplefactory.normal;

/**
 * @author Luoo
 * @create 2017-08-09 10:35
 */

public class FactoryTest {

    public static void main(String[] args) {
        SendFactory factory = new SendFactory();
        Sender sender = factory.produce("sms");
        sender.Send();
    }
}