/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hanm.tpg.test.designpatterns.structural;

import com.hanm.tpg.designpatterns.structural.compisite.Component;
import com.hanm.tpg.designpatterns.structural.compisite.Composite;
import com.hanm.tpg.designpatterns.structural.compisite.Leaf;
import java.util.List;
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
public class CompositeTest {

    public CompositeTest() {
    }

    @Test
    public void CompisiteTest() {
        
        Leaf leaf1 = new Leaf("Bob");
        Leaf leaf2 = new Leaf("Fred");
        Leaf leaf3 = new Leaf("Sue");
        Leaf leaf4 = new Leaf("Ellen");
        Leaf leaf5 = new Leaf("Joe");

        Composite composite1 = new Composite();
        composite1.add(leaf1);
        composite1.add(leaf2);

        Composite composite2 = new Composite();
        composite2.add(leaf3);
        composite2.add(leaf4);

        Composite composite3 = new Composite();
        composite3.add(composite1);
        composite3.add(composite2);
        composite3.add(leaf5);
        
        Assert.assertNotNull(leaf1, "Leaf 1 is null");
        
        List<Component> components1 = composite1.getComponents();
        Assert.assertEquals(components1.get(0), leaf1);
        Assert.assertEquals(components1.get(1), leaf2);
        
        List<Component> components2 = composite2.getComponents();
        Assert.assertEquals(components2.get(0), leaf3);
        Assert.assertEquals(components2.get(1), leaf4);
        
        List<Component> components3 = composite3.getComponents();
        Composite compositeParent = (Composite) components3.get(0);
        Assert.assertEquals(compositeParent.getComponents().get(0), leaf1);
        Assert.assertEquals(compositeParent.getComponents().get(1), leaf2); 
        compositeParent = (Composite) components3.get(1);
        Assert.assertEquals(compositeParent.getComponents().get(0), leaf3);
        Assert.assertEquals(compositeParent.getComponents().get(1), leaf4);
        Assert.assertEquals(components3.get(2), leaf5);
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
