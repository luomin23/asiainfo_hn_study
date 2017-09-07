package com.asiainfo.chapter1.luomin.pattern.proxy.intercept;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Luoo
 * @create 2017-08-25 10:48
 */

public class ActionInvocation {
    List<Interceptor> interceptors = new ArrayList<Interceptor>();

    int index = -1;
    private Action action;


    public ActionInvocation(Action action) {
        this.action = action;
        this.interceptors.add(new FirstInterceptor());

        this.interceptors.add(new SecInterceptor());

        this.interceptors.add(new ThirInterceptor());

    }

    public void invoke() {

        if (index + 1 >= this.interceptors.size()) {

            action.execute();

        } else {

            index++;

            this.interceptors.get(index).intercept(this);

        }

    }

}