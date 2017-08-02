package com.asiainfo.chapter1.dongwenchao.day07;
import java.lang.Exception;
/**
 * Created by 超超 on 2017/8/1 0001.
 */
/*用户自定义异常类，只需继承Exception类即可。
        在程序中使用自定义异常类，大体可分为以下几个步骤。
        （1）创建自定义异常类。
        （2）在方法中通过throw关键字抛出异常对象。
        （3）如果在当前抛出异常的方法中处理异常，可以使用try-catch语句捕获并处理；否则在方法的声明处通过throws关键字指明要抛出给方法调用者的异常，继续进行下一步操作。
        （4）在出现异常方法的调用者中捕获并处理异常。*/
public class demo4 {
    static int run(int x,int y) throws MyException {
        if (x < 0) {
            throw new MyException("除数不能小于零");
        }
        return (x/y);
    }
    public static void main(String[] args){
        int a=4;
        int b=0;
        try{
            int c=run(a,b);
        }catch (MyException e){
            System.out.println(e.getMeage());
        }catch (ArithmeticException e){
            System.out.println("除数不能为0");
        }catch (Exception e) {
            System.out.println("程序发生了其他的异常");
        }
    }
}
        class MyException extends Exception{
            String message; // 定义String类型变量
            public MyException(String ErrorMessagr) { // 父类方法
                message = ErrorMessagr;
            }
            public String getMeage() { // 覆盖getMeage()方法
                return message;
        }
}
