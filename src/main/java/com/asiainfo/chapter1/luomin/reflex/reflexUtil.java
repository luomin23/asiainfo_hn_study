package com.asiainfo.chapter1.luomin.reflex;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author Luoo
 * @create 2017-08-04 15:03
 */

public class reflexUtil {

    public static void invokeMethod4ServiceParentSV() throws ClassNotFoundException, IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {


        File springconfigfile = new File("C:\\idea_workspace\\asiainfo_hn_study\\src\\main\\java\\com\\asiainfo\\chapter1\\luomin\\reflex\\spring.txt");
        Properties springconfig = new Properties();
        springconfig.load(new FileInputStream(springconfigfile));
        String className = (String) springconfig.get("class");
        String methodName = (String) springconfig.get("method");


        Class clazz = Class.forName(className);
        Method method = clazz.getMethod(methodName);

        Constructor constructor = clazz.getConstructor();
        Object service = constructor.newInstance();
        method.invoke(service);

    }


}
