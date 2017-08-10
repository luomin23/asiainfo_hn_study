package com.asiainfo.chapter1.luomin.pattern.create.simplefactory.staticmethod;

import com.asiainfo.chapter1.luomin.pattern.create.simplefactory.normal.MailSender;
import com.asiainfo.chapter1.luomin.pattern.create.simplefactory.normal.Sender;
import com.asiainfo.chapter1.luomin.pattern.create.simplefactory.normal.SmsSender;

/**
 * @author Luoo
 * @create 2017-08-09 10:43
 */

public class SendFactory {

    public static Sender produceMail(){
        return new MailSender();
    }

    public static Sender produceSms(){
        return new SmsSender();
    }
}