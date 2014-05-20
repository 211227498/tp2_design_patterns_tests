/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hanm.tpg.test.designpatterns.behavioural;

import com.hanm.tpg.designpatterns.behavioural.observer.WeatherCustomer1;
import com.hanm.tpg.designpatterns.behavioural.observer.WeatherCustomer2;
import com.hanm.tpg.designpatterns.behavioural.observer.WeatherStation;
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
public class ObserverTest {

    public ObserverTest() {
    }

    @Test
    public void testObserver() {
        
        WeatherStation weatherStation = new WeatherStation(33);
        WeatherCustomer1 wc1 = new WeatherCustomer1();
        WeatherCustomer2 wc2 = new WeatherCustomer2();
        weatherStation.addObserver(wc1);
        weatherStation.addObserver(wc2);
        weatherStation.setTemperature(34);
        
        Assert.assertNotNull(wc1, "Test failed: Temp 34, WC1");
        Assert.assertNotNull(wc2, "Test failed: Temp 34, WC2");
        
        weatherStation.removeObserver(wc1);    
        weatherStation.setTemperature(35);
        
        Assert.assertNotNull(wc2, "Test failed: Temp 35, WC2");
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
