package com.asiainfo.chapter1.luomin.pattern.proxy.intercept;

/**
 * Created by Luoo on 2017/8/25.
 */
public class FirstInterceptor  implements Interceptor {
    @Override
    public void intercept(ActionInvocation invocation) {
        System.out.println(1);

        invocation.invoke();

        System.out.println(-1);

    }
}
