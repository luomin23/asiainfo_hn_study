package com.asiainfo.chapter1.dongwenchao.thread;
import com.asiainfo.chapter1.luhui.luhui9.Thread1;
/**
 * Created by 超超 on 2017/8/11 0011.
 */
public class User implements Runnable {
    static Account  account=new Account ();
    public void run() {
        for (int i=0;i<3;i++){
            account.deposit(1000.00);
        }
    }
}
class Account{
    private double ba;
        public Account(){
        }
    /*public Account(double ba){
        super();
        this.ba=ba;
    }*/
    public synchronized void deposit(double num){//synchronized 代表加锁的意思，就是说，其他的某个线程用到这个方法，就会判断是否有其他的正在使用，如果有就等待
        try{
            Thread.currentThread().sleep(10);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        ba=ba+num;
        //两个线程先后唤醒，第一个线程加1000，没打印，第二个线程又加1000，
        //开始打印第一个线程和第二个，所以线程1和2的余额相同
        System.out.println(Thread.currentThread().getName()+"存款，账户余额："+ba);
    }
    public static void main(String[] args) {
        User a=new User();
        Thread d1=new Thread(a);
        Thread d2 = new Thread(a);
        d1.setName("顾客1");
        d2.setName("顾客2");
        d1.start();
        d2.start();
    }
}

