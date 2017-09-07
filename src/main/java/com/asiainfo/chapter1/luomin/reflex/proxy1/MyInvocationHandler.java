package com.asiainfo.chapter1.luomin.reflex.proxy1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Luoo
 * @create 2017-08-24 14:17
 */

public class MyInvocationHandler implements InvocationHandler {
    //需要被代理的对象
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Authority authority = new Authority();
        //执行权限对象中的in方法
        authority.first();
        System.out.println("正在执行的方法：" + method);
        //if (args != null) {
        //System.out.print("执行该方法时传入的实参：");
        //for (Object val : args) {
        //System.out.println(val);
        //}
        //} else {
        //System.out.println("调用该方法没有实参！");
        //}
        System.out.print("执行结果：");
        Object result = method.invoke(target, args);
        //执行权限对象中的out方法
        authority.last();
        return result;

    }
}
