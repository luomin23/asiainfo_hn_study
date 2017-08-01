package com.asiainfo.chapter1.luhui.luhui5;

/**
 * Created by 18237161432 on 2017/7/28.
 */

interface PCI{//接口内的方法无法静态化，1.8后加入接口静态化。
    void start();
     void stop();
}
class SoundCard implements PCI {
    public void start() {
        System.out.println("buibuibui");
    }

    public void stop() {
        System.out.println("stop  ,stop");
    }
}
/*clsss MainBoard{
        public void usePCICard(PCI np){
            np.start();
            np.stop();
        }
    }*/
    public class interfacetest2 {

    public static void main(String [] args){
    PCI nc =new SoundCard();
        nc.start();
        nc.stop();
}
}
