package com.asiainfo.chapter1.luomin.pattern.create.factorymethod.demo2;

/**
 * @author Luoo
 * @create 2017-08-09 10:54
 */

public class FactoryTest {

    public static void main(String[] args) {
        Provider provider = new SendMailFactory();
        Sender sender = provider.produce();
        sender.Send();
    }
}