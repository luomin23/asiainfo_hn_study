package com.asiainfo.chapter1.liuwy.August03;

/**
 * Created by LENOVO on 2017/8/3.
 */
public class RefectTest {
    public static void main(String[] args) throws Exception{

        String classname=PropersUtil.getProperty("ServiceName");

        Class<Service> c_service = (Class<Service>) Class.forName(classname);
        Service service=c_service.newInstance();
        service.service();
    }
}
