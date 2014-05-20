/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hanm.tpg.test.designpatterns.structural;

import com.hanm.tpg.designpatterns.structural.proxy.FastThing;
import com.hanm.tpg.designpatterns.structural.proxy.SlowThing;
import java.util.Date;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Hannes Morkel (211227498)
 */
public class ProxyTest {

    public ProxyTest() {
    }

    @Test
    public void testThing() {
        
        Date testDate, fastDate, slowDate;

        FastThing fastThing = new FastThing();    
        fastDate = fastThing.sayHello();   
        testDate = new Date();
        Assert.assertEquals(fastDate.toString(), testDate.toString(), "Test failed: FastThing");
        
        SlowThing slowThing = new SlowThing();
        slowDate = slowThing.sayHello();
        testDate = new Date();   
        Assert.assertEquals(slowDate.toString(), testDate.toString(), "Test failed: SlowThing");
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
