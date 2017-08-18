package com.asiainfo.chapter1.Jiashihao.javaBean;


import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;

public class IntrospectarDemo {
    public static void main(String[] args) throws Exception {
        BeanInfo beanInfo = Introspector.getBeanInfo(Persons.class,Object.class);
        PropertyDescriptor[] pds = beanInfo.getPropertyDescriptors();
        for(PropertyDescriptor pd : pds){
        //得到每一个属性的描述器
            System.out.println("属性名称："+pd.getName());
            System.out.println("属性类型："+pd.getPropertyType());
            System.out.println("属性get:"+pd.getWriteMethod());
            System.out.println("属性get:"+pd.getReadMethod());

        }
    }
}
