package com.asiainfo.chapter1.liuwy.August02;

import java.util.List;
import java.util.Scanner;

/**
 * Created by LENOVO on 2017/8/2.
 */
public class View {
    private static Scanner scanner=new Scanner(System.in);
    public static void mainView(){
        System.out.println("商品管理系统！");
        System.out.println("1 添加新商品");
        System.out.println("2 显示所有商品信息");
        System.out.println("3 修改商品数量");
        System.out.println("请输入您的操作：");
        int choose=scanner.nextInt();
        scanner.nextLine();

        //System.out.println(Store.goodslist.size());

        switch (choose){
            case 1:saveGoodsView();
                break;

            case 2: showGoodsView();
                break;
            case 3:  updateNumber();
                break;

        }
    }
    public static void showGoodsView(){
        StoreBIZ goodsBIZ=new StoreBIZ();
        List<Goods> goodsList=goodsBIZ.findAll();
        for (Goods goods:goodsList) {
            System.out.println(goods.getId()+":"+goods.getName()+":"+goods.getPrice()+":"+goods.getNumber()+":"+goods.getOnline());
            
        }

    }

    //保存商品
    public static void saveGoodsView(){
        System.out.println("请输入商品名称：");
        String name=scanner.nextLine();
        System.out.println("请输入商品价格：");
        double price=scanner.nextDouble();
        System.out.println("请输入商品数量：");
        int number=scanner.nextInt();
        scanner.nextLine();

        Goods goods=new Goods();
        goods.setName(name);
        goods.setPrice(price);
        goods.getNumber();
        goods.setOnline(true);

        StoreBIZ storeBIZ=new StoreBIZ();
        if(storeBIZ.save(goods)){
            System.out.println("保存成功！");
        }else {
            System.out.println("保存失败！");

        }
    }
    public static void updateNumber(){
        System.out.println("请输入您要修改的商品名称：");
        String name=scanner.nextLine();
        System.out.println("请输入您要修改的商品的数量：");
        int number =scanner.nextInt();
        scanner.nextLine();

        StoreBIZ storeBIZ=new StoreBIZ();
        storeBIZ.updateNumber(name,number);

    }
}
