package com.asiainfo.chapter1.liuwy.August11;

import java.io.Serializable;

/**
 * Created by LENOVO on 2017/8/11.
 */
public class Request implements Serializable {
    private String serviceName;
    private int id;

    public Request() {
    }

    public String getServiceName() {
        return serviceName;
    }

    public int getId() {
        return id;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public void setId(int id) {
        this.id = id;
    }
}
