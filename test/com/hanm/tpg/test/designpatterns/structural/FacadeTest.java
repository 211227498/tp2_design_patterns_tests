/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hanm.tpg.test.designpatterns.structural;

import com.hanm.tpg.designpatterns.structural.facade.Facade;
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
public class FacadeTest {

    public FacadeTest() {
    }

    @Test
    public void testFacade() {
        
        Facade facade = new Facade();
        Assert.assertEquals(facade.cubeX(3), 27, "Failed test: Cube");
        Assert.assertEquals(facade.cubeXTimes2(3), 54, "Failed test: Cube x2");
        Assert.assertEquals(facade.xToSixthPowerTimes2(3), 1458, "Failed test: Cube To 6th Power x2");
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
