package com.asiainfo.chapter1.liuwy.August02;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LENOVO on 2017/8/2.
 */
public class StoreBIZ {
    List<Goods> goodslist = new ArrayList<Goods>();
//    public static boolean add(Goods goods){
//
////        goodslist.add(new Goods(1,"哇哈哈",3,100,"是"));
////        goodslist.add(new Goods(2,"周黑鸭",30,30,"是"));
////        goodslist.add(new Goods(3,"麻辣小龙虾",60,20,"是"));
//    }
    public  List<Goods> findAll(){
        GoodsDAO goodsDAO=new GoodsDAO();
        List<Goods> goodsList=goodsDAO.findAll();
        return goodsList;
    }
//    public static Goods findById(int id){}
//    public static boolean update(Goods goods){}

    //保存商品
    public boolean save(Goods goods){
        GoodsDAO goodsDAO=new GoodsDAO();
        Goods g=goodsDAO.findByName(goods.getName());
        if(g==null){
            int id=goodsDAO.getId();
            goods.setId(id);
            goodsDAO.save(goods);
            return true;
        }else {
            System.out.println("商品名称已存在！");
            return false;
        }
    }

    //修改商品数量
    public boolean updateNumber(String name,int number ){
        GoodsDAO goodsDAO=new GoodsDAO();
        goodsDAO.update(name,number);
        return true;

    }



}
