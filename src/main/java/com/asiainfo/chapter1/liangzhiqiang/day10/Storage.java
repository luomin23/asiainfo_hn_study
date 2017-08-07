package com.asiainfo.chapter1.liangzhiqiang.day10;

/**
 * Created by 君不悔 on 2017/8/4.
 */

class Storage {
    private int[]cells=new int[10];
    private int inPos,outPos;
    private int count;
    private synchronized void put(int num){
        try {
            while (count==cells.length){
                this.wait();
            }
            cells[inPos]=num;
            System.out.println("在cells["+inPos+"]中放入数据---"+cells[inPos]);
            inPos++;
            if (inPos==cells.length)
                inPos=0;
            count++;
            this.notify();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public synchronized void get(){
        try {
            while (count==0){
                this.wait();
            }
            int data=cells[outPos];
            System.out.println("从cells["+outPos+"]中取出数据"+data);
            cells[outPos]=0;
            outPos++;
            if (outPos==cells.length)
                outPos=0;
            count--;
            this.notify();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

