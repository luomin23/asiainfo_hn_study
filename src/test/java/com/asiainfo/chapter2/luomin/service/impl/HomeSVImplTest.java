package com.asiainfo.chapter2.luomin.service.impl;

import com.asiainfo.chapter2.luomin.entity.Home;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * HomeSVImpl Tester.
 *
 * @author Luoo
 * @version 1.0
 * @since 09/09/2017
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:config/springContext-core.xml"})
@Transactional
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
public class HomeSVImplTest {
    @Resource
    private HomeSVImpl homeSV;

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: getHomeById(String id)
     */
    @Test
    public void testGetHomeById() throws Exception {
//TODO: Test goes here...
        Home home = homeSV.getHomeById("3");
        System.out.println(home.getName());
    }

    /**
     * Method: updateHomeById(Home home)
     */
    @Test
    public void testUpdateHomeById() throws Exception {
//TODO: Test goes here...
        Home home = homeSV.getHomeById("3");
        home.setName("luoo");
        int u = homeSV.updateHomeById(home);
        System.out.println(u);

        Home newhome = homeSV.getHomeById("3");
        System.out.println(newhome.getName());

    }

    /**
     * Method: insertHome(Home home)
     */
    @Test
    public void testInsertHome() throws Exception {
//TODO: Test goes here...
        Home home = homeSV.getHomeById("3");
        home.setName("nestluoo");
        int u = homeSV.insertHome(home);
        System.out.println(u);
    }


} 
