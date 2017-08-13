package com.asiainfo.chapter1.liuwy.August11;

import java.io.Serializable;

/**
 * Created by LENOVO on 2017/8/11.
 */
public class Admins implements Serializable {
    private int adminId;
    private String adminName;
    private String adminPassword;

    public Admins() {
    }

    public Admins(int adminId, String adminName, String adminPassword) {
        this.adminId = adminId;
        this.adminName = adminName;
        this.adminPassword = adminPassword;
    }

    public int getAdminId() {
        return adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }
}
