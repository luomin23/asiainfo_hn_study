package com.asiainfo.chapter1.luomin.pattern.proxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 实现了方法拦截器接口
 *
 * @author Luoo
 * @create 2017-08-25 10:24
 */
public class Hacker implements MethodInterceptor {
    @Override
    public Object intercept(Object obj, Method method, Object[] args,
                            MethodProxy proxy) throws Throwable {
        System.out.println("**** I am a hacker,Let's see what the poor programmer is doing Now...");
        proxy.invokeSuper(obj, args);
        System.out.println("****  Oh,what a poor programmer.....");
        return null;
    }

}

