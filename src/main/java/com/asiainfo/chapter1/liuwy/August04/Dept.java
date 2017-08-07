package com.asiainfo.chapter1.liuwy.August04;

/**
 * Created by LENOVO on 2017/8/4.
 */
public class Dept {
    private int deptno;
    private String name;
    private String loc;

    public Dept() {
    }

    public Dept(int deptno, String name, String loc) {
        this.deptno = deptno;
        this.name = name;
        this.loc = loc;
    }

    public int getDeptno() {
        return deptno;
    }

    public String getName() {
        return name;
    }

    public String getLoc() {
        return loc;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }
}
