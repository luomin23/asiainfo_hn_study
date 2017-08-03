package com.asiainfo.chapter1.liuwy.August02;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by LENOVO on 2017/8/2.
 */
public class Store {
    public static List<Goods> goodslist = new ArrayList<Goods>();
    static {
        goodslist.add(new Goods(1,"哇哈哈",3,100,true));
        goodslist.add(new Goods(2,"周黑鸭",30,30,true));
        goodslist.add(new Goods(3,"麻辣小龙虾",60,20,true));
    }
}
