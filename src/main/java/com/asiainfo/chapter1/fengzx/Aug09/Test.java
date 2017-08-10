package com.asiainfo.chapter1.fengzx.Aug09;

import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * Created by fengzx on 2017/8/9.
 */
public class Test {
    public static void main(String[] args) throws Exception {
        Properties prop = new Properties();
        prop.load(Test.class.getResourceAsStream("classes.properties"));

        String classname = prop.getProperty("classname");
        String methodname= prop.getProperty("methodname");

        Class c = Class.forName(classname);

        Constructor con = c.getConstructor();
        Object obj = con.newInstance();

        Method m = c.getMethod(methodname);
        m.invoke(obj);
    }
}
