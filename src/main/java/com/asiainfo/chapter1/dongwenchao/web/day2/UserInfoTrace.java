package com.asiainfo.chapter1.dongwenchao.web.day2;

/**
 * Created by 超超 on 2017/8/17 0017.
 */
import javax.servlet.http.HttpSessionBindingEvent;

public class UserInfoTrace implements javax.servlet.http.HttpSessionBindingListener {
    private String user;
    private UserInfoList container = UserInfoList.getInstance();


    public UserInfoTrace() {
        user = "";
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getUser() {
        return this.user;
    }

    public void valueBound(HttpSessionBindingEvent arg0) {
        System.out.println("上线" + this.user);

    }

    public void valueUnbound(HttpSessionBindingEvent arg0) {
        System.out.println("下线" + this.user);
        if (user != "") {
            container.removeUserInfo(user);
        }
    }

}
