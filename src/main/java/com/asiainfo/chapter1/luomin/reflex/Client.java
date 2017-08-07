package com.asiainfo.chapter1.luomin.reflex;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/**
 * @author Luoo
 * @create 2017-08-04 14:51
 */

public class Client {
    public static void main(String[] args) throws NoSuchMethodException, IOException, InstantiationException, IllegalAccessException, InvocationTargetException, ClassNotFoundException {

        //当需要从第一个业务方法切换到第二个业务方法的时候，
        // 使用非反射方式，必须修改代码，
        // 并且重新编译运行，才可以达到效果

//        ServiceParent sp = new ServiceOne();
        ServiceParent sp = new ServiceTwo();
        sp.doService();

        //反射方式
        reflexUtil.invokeMethod4ServiceParentSV();



    }
}
