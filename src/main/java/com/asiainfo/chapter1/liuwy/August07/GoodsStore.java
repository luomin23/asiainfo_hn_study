package com.asiainfo.chapter1.liuwy.August07;

import com.asiainfo.chapter1.liuwy.August02.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LENOVO on 2017/8/7.
 */
public class GoodsStore {
    private GoodsStore(){}
    public static List<Goods> goodsList=new ArrayList<Goods>();
    static {
        goodsList.add(new Goods(1,"苹果",10));
        goodsList.add(new Goods(2,"菠萝",20));
        goodsList.add(new Goods(3,"香蕉",30));
        goodsList.add(new Goods(4,"葡萄",40));
    }
}
