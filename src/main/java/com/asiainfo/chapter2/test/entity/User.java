package com.asiainfo.chapter2.test.entity;

import com.asiainfo.chapter2.common.persistence.DataEntity;

public class User extends DataEntity {
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