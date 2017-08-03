package com.asiainfo.chapter1.liuwy.August02;

import java.util.List;

/**
 * Created by LENOVO on 2017/8/2.
 */
public class GoodsDAO {

    public List<Goods> findAll(){
        List<Goods> goodsList=Store.goodslist;
        return goodsList;
    }

    //添加商品
    public void save(Goods goods){
        Store.goodslist.add(goods);
    }
    //自动生成编号，规则 max+1
    public int  getId(){
        List<Goods> goodsList=Store.goodslist;
        if (goodsList.isEmpty()){
            return 1;
        }else {
            int max=goodsList.get(0).getId();
            for (Goods goods:goodsList) {
                if (goods.getId()>max){
                    max=goods.getId();
                }
            }
            return max+1;
        }
    }

    //按名称查询
    public Goods findByName(String name){
        List<Goods> goodsList=Store.goodslist;
        if (goodsList.isEmpty()){
            return null;
        }else {
            for (Goods goods:goodsList) {
                if (name.equals(goods.getName())){
                    return goods;
                }
            }
            return null;
        }

    }
    public void update(String name,int number){
        List<Goods> goodsList=Store.goodslist;
        for (Goods goods:goodsList) {
            if(goods.getName()==name){
                int a=goods.getNumber();
                a=number;
            }
        }
    }
}
