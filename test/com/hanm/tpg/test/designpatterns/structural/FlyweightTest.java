/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hanm.tpg.test.designpatterns.structural;

import com.hanm.tpg.designpatterns.structural.flyweight.Flyweight;
import com.hanm.tpg.designpatterns.structural.flyweight.FlyweightFactory;
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
public class FlyweightTest {

    public FlyweightTest() {
    }

    @Test
    public void testFlyweight() {
        
        FlyweightFactory flyweightFactory = FlyweightFactory.getInstance();
        int testAnsw;
        
        for (int k = 0; k < 5; k++) {
            Flyweight flyweightAdder = flyweightFactory.getFlyweight("add");
            testAnsw = flyweightAdder.doMath(k, k);
            Assert.assertEquals(testAnsw, k+k, "Test failed: Add");
        }
        
        for (int i = 0; i < 5; i++) {
            Flyweight flyweightMultiplier = flyweightFactory.getFlyweight("multiply");
            testAnsw = flyweightMultiplier.doMath(i, i);
            Assert.assertEquals(testAnsw, i*i, "Test failed: Multiply");
        }
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
