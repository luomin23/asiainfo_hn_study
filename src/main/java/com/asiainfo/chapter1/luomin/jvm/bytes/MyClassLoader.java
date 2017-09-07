package com.asiainfo.chapter1.luomin.jvm.bytes;

/**
 * 自定义一个类加载器，用于将字节码转换为class对象
 * @author Luoo
 * @create 2017-08-24 20:26
 */

public class MyClassLoader extends ClassLoader {

    public Class<?> defineMyClass( byte[] b, int off, int len)
    {
        return super.defineClass(b, off, len);
    }

}
