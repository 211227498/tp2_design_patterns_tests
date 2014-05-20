/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hanm.tpg.test.designpatterns.structural;

import com.hanm.tpg.designpatterns.structural.decorator.Animal;
import com.hanm.tpg.designpatterns.structural.decorator.GrowlDecorator;
import com.hanm.tpg.designpatterns.structural.decorator.LegDecorator;
import com.hanm.tpg.designpatterns.structural.decorator.LivingAnimal;
import com.hanm.tpg.designpatterns.structural.decorator.WingDecorator;
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
public class DecoratorTest {
     
    public DecoratorTest() {
    }
    
    @Test
    public void testLivingAnimal() { 
        
        Animal animal = new LivingAnimal();
	String descr = animal.describe();     
        String testString = "\nI am an animal.";
        Assert.assertEquals(descr, testString);
        
        animal = new LegDecorator(animal);
	descr = animal.describe();   
        testString = "\nI am an animal.\nI have legs.\nI can dance.";
        Assert.assertEquals(descr, testString);
        
        animal = new WingDecorator(animal);
	descr = animal.describe();
        testString = "\nI am an animal.\nI have legs.\nI can dance.\nI have wings.\nI can fly.";
        Assert.assertEquals(descr, testString);
        
        animal = new GrowlDecorator(animal);
	animal = new GrowlDecorator(animal);
	descr = animal.describe();
        testString = "\nI am an animal.\nI have legs.\nI can dance.\nI have wings.\nI can fly.\nGrrrrr.\nGrrrrr.";
        Assert.assertEquals(descr, testString);
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
