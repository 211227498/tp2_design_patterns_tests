/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hanm.tpg.test.designpatterns.creational;

import com.hanm.tpg.designpatterns.creational.singleton.SingletonExample;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Hannes Morkel (211227498)
 */
public class SingletonExampleTest {
    
    public SingletonExampleTest() {
    }
    
    @Test
    public void testSingleton() {
        SingletonExample singletonExample = SingletonExample.getInstance();
        org.testng.Assert.assertEquals(singletonExample.sayHello(), "Hello");
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
