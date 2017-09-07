package com.asiainfo.chapter1.luomin.rmi.demo1;

import java.rmi.Remote;

/**
 * @author Luoo
 * @create 2017-08-23 11:07
 */
public interface IHello extends Remote {

    public String sayHello(String name) throws java.rmi.RemoteException;
}