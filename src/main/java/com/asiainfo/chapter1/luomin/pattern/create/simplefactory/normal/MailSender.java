package com.asiainfo.chapter1.luomin.pattern.create.simplefactory.normal;

/**
 * @author Luoo
 * @create 2017-08-09 10:34
 */

public class MailSender implements Sender {
    @Override
    public void Send() {
        System.out.println("this is mailsender!");
    }
}