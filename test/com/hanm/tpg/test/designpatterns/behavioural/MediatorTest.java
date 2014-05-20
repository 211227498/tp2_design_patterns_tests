/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hanm.tpg.test.designpatterns.behavioural;

import com.hanm.tpg.designpatterns.behavioural.mediator.AmericanSeller;
import com.hanm.tpg.designpatterns.behavioural.mediator.Buyer;
import com.hanm.tpg.designpatterns.behavioural.mediator.DollarConverter;
import com.hanm.tpg.designpatterns.behavioural.mediator.FrenchBuyer;
import com.hanm.tpg.designpatterns.behavioural.mediator.Mediator;
import com.hanm.tpg.designpatterns.behavioural.mediator.SwedishBuyer;
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
public class MediatorTest {

    public MediatorTest() {
    }

    @Test
    public void testMediator() {
        
        Mediator mediator = new Mediator();
        Buyer swedishBuyer = new SwedishBuyer(mediator);
        Buyer frenchBuyer = new FrenchBuyer(mediator);
        float sellingPriceInDollars = 10.0f;
        AmericanSeller americanSeller = new AmericanSeller(mediator, sellingPriceInDollars);
        DollarConverter dollarConverter = new DollarConverter(mediator);

        float swedishBidInKronor = 55.0f; 
        Assert.assertEquals(swedishBuyer.attemptToPurchase(swedishBidInKronor), false);
        swedishBidInKronor += 15.0f;
        Assert.assertEquals(swedishBuyer.attemptToPurchase(swedishBidInKronor), false);
        swedishBidInKronor += 15.0f;
        Assert.assertEquals(swedishBuyer.attemptToPurchase(swedishBidInKronor), true);

        float frenchBidInEuros = 3.0f;
        Assert.assertEquals(frenchBuyer.attemptToPurchase(frenchBidInEuros), false);
        frenchBidInEuros += 1.5f;
        Assert.assertEquals(frenchBuyer.attemptToPurchase(frenchBidInEuros), false);
        frenchBidInEuros += 1.5f;
        Assert.assertEquals(frenchBuyer.attemptToPurchase(frenchBidInEuros), false);
        frenchBidInEuros += 1.5f;
        Assert.assertEquals(frenchBuyer.attemptToPurchase(frenchBidInEuros), true);
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
