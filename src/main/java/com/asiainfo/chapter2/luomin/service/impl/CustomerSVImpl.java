package com.asiainfo.chapter2.luomin.service.impl;

import com.asiainfo.chapter2.luomin.bo.BOCustomerBean;
import com.asiainfo.chapter2.luomin.service.interfaces.ICustomerSV;

/**
 * @author Luoo
 * @create 2017-08-18 10:15
 */

public class CustomerSVImpl implements ICustomerSV{
    @Override
    public BOCustomerBean queryCustomerById(long id) {
        BOCustomerBean bean = new BOCustomerBean();
        bean.setId(id);
        bean.setName("hello");
        return bean;
    }
}
