package com.asiainfo.chapter1.liuwy.August11;

import java.io.Serializable;

/**
 * Created by LENOVO on 2017/8/11.
 */
public class GoodsType implements Serializable{
    private int typeId;
    private String typeName;

    public GoodsType() {
    }

    public GoodsType(int typeId, String typeName) {
        this.typeId = typeId;
        this.typeName = typeName;
    }

    public int getTypeId() {
        return typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}
