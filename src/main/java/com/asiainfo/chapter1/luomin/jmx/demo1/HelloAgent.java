package com.asiainfo.chapter1.luomin.jmx.demo1;

/**
 * @author Luoo
 * @create 2017-08-23 14:56
 */


import com.sun.jdmk.comm.HtmlAdaptorServer;

import javax.management.MBeanServer;
import javax.management.ObjectName;
import java.lang.management.ManagementFactory;

public class HelloAgent {
    public static void main(String[] args) throws Exception {
        //      MBeanServer server = MBeanServerFactory.createMBeanServer();
        MBeanServer server = ManagementFactory.getPlatformMBeanServer();
        ObjectName helloName = new ObjectName("chengang:name=HelloWorld");
        server.registerMBean(new Hello(), helloName);
        ObjectName adapterName = new ObjectName("HelloAgent:name=htmladapter,port=8082");
        HtmlAdaptorServer adapter = new HtmlAdaptorServer();
        server.registerMBean(adapter, adapterName);
        adapter.start();
        System.out.println("start.....");
    }
}

