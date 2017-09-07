package com.asiainfo.chapter1.luomin.jmx.demo2;

/**
 * @author Luoo
 * @create 2017-08-23 15:38
 */

import com.asiainfo.chapter1.luomin.jmx.demo1.Hello;

import javax.management.Notification;
import javax.management.NotificationListener;

public class HelloListener implements NotificationListener {
    public void handleNotification(Notification n, Object handback) {
        System.out.println("type=" + n.getType());
        System.out.println("source=" + n.getSource());
        System.out.println("seq=" + n.getSequenceNumber());
        System.out.println("send time=" + n.getTimeStamp());
        System.out.println("message=" + n.getMessage());
        if (handback != null) {
            if (handback instanceof Hello) {
                Hello hello = (Hello) handback;
                hello.printHello(n.getMessage());
            }
        }
    }
}
