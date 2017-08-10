package com.asiainfo.chapter1.luomin.pattern.create.simplefactory.moremethod;

import com.asiainfo.chapter1.luomin.pattern.create.simplefactory.normal.MailSender;
import com.asiainfo.chapter1.luomin.pattern.create.simplefactory.normal.Sender;
import com.asiainfo.chapter1.luomin.pattern.create.simplefactory.normal.SmsSender;

/**
 * @author Luoo
 * @create 2017-08-09 10:39
 */

public class SendFactory {

    public Sender produceMail(){
        return new MailSender();
    }

    public Sender produceSms(){
        return new SmsSender();
    }
}