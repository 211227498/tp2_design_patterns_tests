/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hanm.tpg.test.designpatterns.behavioural;

import com.hanm.tpg.designpatterns.behavioural.templatemethod.CheeseburgerMeal;
import com.hanm.tpg.designpatterns.behavioural.templatemethod.HamburgerMeal;
import com.hanm.tpg.designpatterns.behavioural.templatemethod.Meal;
import java.util.Map;
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
public class TempleMethodTest {

    public TempleMethodTest() {
    }

    @Test
    public void testTempleMethod() {
        
        Meal meal = new HamburgerMeal();
        Map<String, String> testValues = meal.doMeal();
        Assert.assertEquals(testValues.get("prepareIngredients"), "Getting burgers, buns, and french fries");
        Assert.assertEquals(testValues.get("cook"), "Cooking burgers on grill and fries in oven");
        Assert.assertEquals(testValues.get("eat"), "Mmm, that's good");
        Assert.assertEquals(testValues.get("cleanUp"), "Throwing away paper plates");
        
        meal = new CheeseburgerMeal();
        testValues = meal.doMeal();
        Assert.assertEquals(testValues.get("prepareIngredients"), "Getting ground beef and Cheese");
        Assert.assertEquals(testValues.get("cook"), "Cooking ground beef in pan");
        Assert.assertEquals(testValues.get("eat"), "The Cheese Burgers are tasty");
        Assert.assertEquals(testValues.get("cleanUp"), "Doing the dishes");
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
