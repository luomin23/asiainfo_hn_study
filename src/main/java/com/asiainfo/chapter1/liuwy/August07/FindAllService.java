package com.asiainfo.chapter1.liuwy.August07;

import java.util.List;

/**
 * Created by LENOVO on 2017/8/7.
 */
public class FindAllService {
    public List<Goods> findAll(){
        List<Goods> goodsList=GoodsStore.goodsList;
        return goodsList;
    }
}
