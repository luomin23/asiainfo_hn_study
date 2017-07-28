package com.asiainfo.chapter1.Jiashihao.leiduixiang;

/**
 * Created by lenovo on 2017/7/28.
 */
class Check{
    public boolean validate(String name,String password){  //执行具体的验证操作
        if(name.equals("jiashihao") && password.equals("2996")){  // 验证
            return true;   //登录信息正确，返回true
        }else{
            return false;    //登录信息错误，返回false
        }
    }
}
class Operate{                   //本类只是调用具体的验证操作
    private String info[];      //定义一个数组属性，用于接收全部输入参数
      public Operate(String info[]){
         this.info = info;        //通过构造方法取得全部的输入参数
      }
    public String login(){
        Check check = new Check();    //实例化Check对象，用于检查信息
        this.isExit();         // 判断输入的参数格式，用来决定程序是否退出

        String name = this.info[0];    //取出用户名
        String password = this.info[1];   //取出密码
        String str = null;       //声明一个变量，用于接收信息
        if(check.validate(name,password)){   //登录验证
            str = "欢迎" + name + "光临！";
        }else{
            str = "错误的用户名和密码！";
        }
        return str;    //返回信息给用户
    }
    public void isExit(){
        if(this.info.length!= 2){     //判断参数个数
            System.out.println("输入的参数不正确，系统退出！");   // 给一个正确的格式
            System.out.println("格式：neibulei  用户名 密码");
            System.exit(1); // 系统退出
        }
    }
}
public class neibulei {
    public static void main(String args[]){
        Operate oper = new Operate(args);     //实例化操作类对象
        System.out.println(oper.login());     //取得验证信息
    }
}
