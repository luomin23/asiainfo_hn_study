package com.asiainfo.chapter1.liuwy.August11;



import java.io.*;
import java.util.Arrays;
import java.util.List;

/**
 * Created by LENOVO on 2017/8/11.
 */
public class Test {
    public static void main(String[] args)throws FileNotFoundException,IOException,ClassNotFoundException{
//        List<Users> usersList= Arrays.asList(new Users(1,"liu","123"));
//        List<Admins> adminsList=Arrays.asList(new Admins(1,"admin","123"));
//        GoodsType gt=new GoodsType(1,"轿车");
//        List<GoodsType> goodsTypeList=Arrays.asList(
//                gt,
//                new GoodsType(2,"SUV")
//        );
//        List<Goods> goodsList=Arrays.asList(
//                new Goods(1,"wowo",20.0,1000,true,gt),
//                new Goods(2,"Honda",15.0,8000,true,gt)
//        );
//        ObjectOutput user_os=new ObjectOutputStream(new FileOutputStream(
//                "d:/super/user.txt"));
//        ObjectOutput admin_os=new ObjectOutputStream(new FileOutputStream(
//                "d:/super/admin.txt"));
//        ObjectOutput type_os=new ObjectOutputStream(new FileOutputStream(
//                "d:/super/type.txt"));
//        ObjectOutput goods_os=new ObjectOutputStream(new FileOutputStream(
//                "d:/super/goods.txt"));
//        user_os.writeObject(usersList);
//        admin_os.writeObject(adminsList);
//        type_os.writeObject(goodsTypeList);
//        goods_os.writeObject(goodsList);
//        System.out.println("ok");



        ObjectInputStream is=new ObjectInputStream(new FileInputStream("d:/super/goods.dat"));
        List<Goods> goodsList=(List<Goods>) is.readObject();
        for (Goods goods:goodsList) {
            System.out.println(goods.getGoodsId()+":"+goods.getGoodsName());
        }

    }
}
