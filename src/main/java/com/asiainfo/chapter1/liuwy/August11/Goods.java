package com.asiainfo.chapter1.liuwy.August11;

import java.io.Serializable;

/**
 * Created by LENOVO on 2017/8/11.
 */
public class Goods implements Serializable{
    private int goodsId;
    private String goodsName;
    private Double goodsPrice;
    private int goodsNum;
    private boolean goodsStatus;
    private GoodsType goodsType;

    public Goods() {
    }

    public Goods(int goodsId, String goodsName, Double goodsPrice, int goodsNum, boolean goodsStatus,GoodsType goodsType) {
        this.goodsId = goodsId;
        this.goodsName = goodsName;
        this.goodsPrice = goodsPrice;
        this.goodsNum = goodsNum;
        this.goodsStatus = goodsStatus;
        this.goodsType = goodsType;
    }

    public int getGoodsId() {
        return goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public Double getGoodsPrice() {
        return goodsPrice;
    }

    public int getGoodsNum() {
        return goodsNum;
    }

    public boolean isGoodsStatus() {
        return goodsStatus;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public void setGoodsPrice(Double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public void setGoodsNum(int goodsNum) {
        this.goodsNum = goodsNum;
    }

    public void setGoodsStatus(boolean goodsStatus) {
        this.goodsStatus = goodsStatus;
    }

    public GoodsType getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(GoodsType goodsType) {
        this.goodsType = goodsType;
    }
}
