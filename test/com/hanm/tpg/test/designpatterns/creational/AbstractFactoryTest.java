/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hanm.tpg.test.designpatterns.creational;

import com.hanm.tpg.designpatterns.creational.abstractfactory.AbstractFactory;
import com.hanm.tpg.designpatterns.creational.abstractfactory.SpeciesFactory;
import com.hanm.tpg.designpatterns.creational.factorymethod.Animal;
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
public class AbstractFactoryTest {
    
    private static AbstractFactory animalFactory;
    public AbstractFactoryTest() {
    }
    
    @Test
    public void testMammal() {
        
        SpeciesFactory speciesFactory  = animalFactory.getSpeciesFactory("mammal");
        Animal dog = speciesFactory.getAnimal("dog");    
        Assert.assertEquals(dog.makeSound(), "Woof");
        
        speciesFactory  = animalFactory.getSpeciesFactory("mammal");
        Animal cat = speciesFactory.getAnimal("cat");  
        Assert.assertEquals(cat.makeSound(), "Meow");
    }
    
    @Test
    public void testReptile() {
        
        SpeciesFactory speciesFactory  = animalFactory.getSpeciesFactory("reptile");
        Animal snake = speciesFactory.getAnimal("snake");  
        Assert.assertEquals(snake.makeSound(), "Hiss");
        
        speciesFactory  = animalFactory.getSpeciesFactory("reptile");
        Animal tyrannosaurus  = speciesFactory.getAnimal("tyrannosaurus");
        Assert.assertEquals(tyrannosaurus.makeSound(), "Roar");
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        
        animalFactory = new AbstractFactory();
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
