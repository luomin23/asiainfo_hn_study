package com.asiainfo.chapter1.Jiashihao.org.lxh.demo15;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by lenovo on 2017/8/9.
 */
public class Menu {
    public Menu() throws IOException {
        while(true){
            this.show();
            //无限制调用菜单显示
        }
    }
    public void show() throws IOException {
        System.out.println("================");
        System.out.println("[1]、查询数据");
        System.out.println("[2]、保存数据");
        System.out.println("[0]、退出\n");
        int i =0;
        BufferedReader buf = null;
        buf = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        str = buf.readLine();
        i = Integer.parseInt(str);
        switch(i){
            case 1:{
                Operate.search();
                break;
            }
            case 2:{
                Operate.save();
                break;
            }
            case 0:{
                System.exit(1);
                break;
            }
            default:{
                System.out.println("请选择正确的操作！");
            }
        }
    }
}
