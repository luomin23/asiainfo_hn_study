package com.asiainfo.chapter1.sunmd1.FibSequence_0727;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/7/26 0026.
 */

public class RabbitNum {

    //定义一个list，存储兔子

    private List<Rabbit> list = new ArrayList<Rabbit>();

    public int getRabNum(int month){
        //初始化list,放入一对兔子
        list.add(new Rabbit());
        //每个月查看所有兔子年龄
        for(int m=1;m<=month;m++){
            //遍历所有兔子
            for (int i=0;i<list.size();i++){
                Rabbit rabbit = list.get(i);
                //判断年龄
                if(rabbit.getAge()>=3){
                    list.add(new Rabbit());
                }
                //每个兔子年龄+1
                rabbit.getUp();
            }
            System.out.println("第"+m+"月有"+list.size()+"对兔子");
        }
        return list.size();
    }

    //递归算法计算兔子数

    public int fun(int month){
      if(month == 1 || month == 2)
        return 1;
      return fun(month-1)+fun(month-2);
    }


    public static void main(String[] args) {
        RabbitNum rn = new RabbitNum();
        rn.getRabNum(5);
        System.out.println(rn.fun(5));
    }

}
