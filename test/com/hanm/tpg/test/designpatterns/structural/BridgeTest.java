/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hanm.tpg.test.designpatterns.structural;

import com.hanm.tpg.designpatterns.structural.bridge.BigBus;
import com.hanm.tpg.designpatterns.structural.bridge.BigEngine;
import com.hanm.tpg.designpatterns.structural.bridge.SmallCar;
import com.hanm.tpg.designpatterns.structural.bridge.SmallEngine;
import com.hanm.tpg.designpatterns.structural.bridge.Vehicle;
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
public class BridgeTest {

    public BridgeTest() {  
    }

    @Test
    public void testBridge() {
        
        Vehicle vehicle = new BigBus(new SmallEngine());
        Assert.assertEquals(vehicle.drive(), "The vehicle is going at a slow speed.");
        vehicle.setEngine(new BigEngine());
        Assert.assertEquals(vehicle.drive(), "The vehicle is going at a slow speed.");
        
        vehicle = new SmallCar(new SmallEngine());
        Assert.assertEquals(vehicle.drive(), "The vehicle is going an average speed.");
        vehicle.setEngine(new BigEngine());
        Assert.assertEquals(vehicle.drive(), "The vehicle is going at a fast speed.");
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
