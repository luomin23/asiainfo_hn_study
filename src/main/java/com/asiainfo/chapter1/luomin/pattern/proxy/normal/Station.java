package com.asiainfo.chapter1.luomin.pattern.proxy.normal;

/**
 * 售票服务接口实现类，车站
 *
 * @author Luoo
 * @create 2017-08-25 9:25
 */
public class Station implements TicketService {

    @Override
    public void sellTicket() {
        System.out.println("\n\t售票.....\n");
    }

    @Override
    public void inquire() {
        System.out.println("\n\t问询。。。。\n");
    }

    @Override
    public void withdraw() {
        System.out.println("\n\t退票......\n");
    }

}
