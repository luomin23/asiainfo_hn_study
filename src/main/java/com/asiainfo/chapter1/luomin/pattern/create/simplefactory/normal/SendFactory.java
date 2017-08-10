package com.asiainfo.chapter1.luomin.pattern.create.simplefactory.normal;

/**
 * @author Luoo
 * @create 2017-08-09 10:34
 */

public class SendFactory {

    public Sender produce(String type) {
        if ("mail".equals(type)) {
            return new MailSender();
        } else if ("sms".equals(type)) {
            return new SmsSender();
        } else {
            System.out.println("请输入正确的类型!");
            return null;
        }
    }
}