package com.asiainfo.chapter1.luomin.pattern.create.factorymethod.demo2;

/**
 * @author Luoo
 * @create 2017-08-09 10:50
 */

public class SendMailFactory implements Provider {

    @Override
    public Sender produce(){
        return new MailSender();
    }
}