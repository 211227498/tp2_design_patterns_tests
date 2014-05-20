/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hanm.tpg.test.designpatterns.creational;

import com.hanm.tpg.designpatterns.creational.factorymethod.Animal;
import com.hanm.tpg.designpatterns.creational.factorymethod.AnimalFactory;
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
public class FactoryMethodTest {
    
    public FactoryMethodTest() {
    }
    
    @Test
    public void testDog() {
        
        AnimalFactory animalFactory = new AnimalFactory();
        Animal dog = animalFactory.getAnimal("canine");
        Assert.assertEquals(dog.makeSound(), "Woof");
    }

    @Test
    public void testCat() {
        
        AnimalFactory animalFactory = new AnimalFactory();
        Animal dog = animalFactory.getAnimal("feline");
        Assert.assertEquals(dog.makeSound(), "Meow");
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
