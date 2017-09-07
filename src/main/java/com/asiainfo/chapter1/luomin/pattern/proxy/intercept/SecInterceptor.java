package com.asiainfo.chapter1.luomin.pattern.proxy.intercept;

/**
 * @author Luoo
 * @create 2017-08-25 10:47
 */

public class SecInterceptor implements Interceptor {


    @Override

    public void intercept(ActionInvocation invocation) {

        System.out.println(2);

        invocation.invoke();

        System.out.println(-2);

    }


}
