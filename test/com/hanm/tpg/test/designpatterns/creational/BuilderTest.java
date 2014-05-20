/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hanm.tpg.test.designpatterns.creational;

import com.hanm.tpg.designpatterns.creational.builder.ItalianMealBuilder;
import com.hanm.tpg.designpatterns.creational.builder.JapaneseMealBuilder;
import com.hanm.tpg.designpatterns.creational.builder.Meal;
import com.hanm.tpg.designpatterns.creational.builder.MealBuilder;
import com.hanm.tpg.designpatterns.creational.builder.MealDirector;
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
public class BuilderTest {
    
    public BuilderTest() {
    }
    
    @Test
    public void MealTest() {
        
        MealBuilder mealBuilder = new ItalianMealBuilder();
        MealDirector mealDirector = new MealDirector(mealBuilder);
        
        mealDirector.constructMeal();
        Meal meal = mealDirector.getMeal();
        
        String testString = "drink:red wine, main course:pizza, side:bread";
        Assert.assertEquals(meal.toString(), testString);
        
        mealBuilder = new JapaneseMealBuilder();
        mealDirector = new MealDirector(mealBuilder);
        
        mealDirector.constructMeal();
        meal = mealDirector.getMeal();
        
        testString = "drink:sake, main course:chicken teriyaki, side:miso soup";
        Assert.assertEquals(meal.toString(), testString);
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
