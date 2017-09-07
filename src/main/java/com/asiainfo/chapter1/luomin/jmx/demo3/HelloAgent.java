package com.asiainfo.chapter1.luomin.jmx.demo3;


import com.sun.jdmk.comm.HtmlAdaptorServer;

import javax.management.MBeanServer;
import javax.management.MBeanServerFactory;
import javax.management.ObjectName;

/**
 * @author Luoo
 * @create 2017-08-23 15:56
 */
public class HelloAgent {
    public static void main(String[] args) throws Exception {
        MBeanServer server = MBeanServerFactory.createMBeanServer();
        ObjectName helloName = new ObjectName("chengang:name=HelloDynamic");
        HelloDynamic hello = new HelloDynamic();
        server.registerMBean(hello, helloName);
        ObjectName adapterName = new ObjectName("HelloAgent:name=htmladapter,port=8082");
        HtmlAdaptorServer adapter = new HtmlAdaptorServer();
        server.registerMBean(adapter, adapterName);
        adapter.start();
        System.out.println("start.....");
    }
}
