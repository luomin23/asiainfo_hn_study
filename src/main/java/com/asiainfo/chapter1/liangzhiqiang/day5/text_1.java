package com.asiainfo.chapter1.liangzhiqiang.day5;

/**
 * Created by 君不悔 on 2017/7/28.
 */
public class text_1 {
        public static void main(String[]args){
            Computer compute=new Computer();
            Camera camera1=new Camera() ;
            Phone phone1=new Phone();
            compute.useUsb(camera1);
            compute.useUsb(phone1);
        }
    }
//接口
//定义Usb的接口抽象类
    interface Usb{
        int a=1;
        public void start();
        public  void  stop();
    //声明两个方法，start开始工作，stop停止工作。
    }
    class Camera implements Usb{
        public void start(){
            System.out.println("相机不工作");

        }
        public void stop(){
            System.out.println("相机工作");
        }
    }
    class Phone implements Usb{
        public void start(){
            System.out.println("手机工作");

        }
        public void stop(){
            System.out.println("手机不工作");
        }
    }
interface Tt{
    //接口继承别的接口
}
    interface Tt1 extends Tt{

    }
    class Computer{
        public void useUsb(Usb usb){
            usb.start();
            usb.stop();
        }
    }


