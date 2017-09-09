package com.asiainfo.chapter2.luomin.entity;

import com.asiainfo.chapter2.common.persistence.DataEntity;

/**
 * @author Luoo
 * @create 2017-09-08 15:42
 */

public class Home extends DataEntity<Home> {
    private String id;
    private String name;

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public void preInsert() {

    }

    @Override
    public void preUpdate() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
