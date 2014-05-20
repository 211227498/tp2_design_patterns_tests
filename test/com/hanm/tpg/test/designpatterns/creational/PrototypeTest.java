/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hanm.tpg.test.designpatterns.creational;

import com.hanm.tpg.designpatterns.creational.prototype.Dog;
import com.hanm.tpg.designpatterns.creational.prototype.Person;
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
public class PrototypeTest {
    
    public PrototypeTest() {
    }
   
    @Test
    public void testPerson() {
        
        Person person = new Person("Fred");
        Person clonePerson = (Person) person.doClone(); 
        Assert.assertEquals(clonePerson.toString(), person.toString(), "Person test failed!");
        
        Dog dog = new Dog("Woof!");
        Dog cloneDog = (Dog) dog.doClone(); 
        Assert.assertEquals(cloneDog.toString(), dog.toString(), "Dog test failed!");
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
