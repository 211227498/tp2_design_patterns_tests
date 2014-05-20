/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hanm.tpg.test.designpatterns.structural;

import com.hanm.tpg.designpatterns.structural.adapter.TemperatureClassReporter;
import com.hanm.tpg.designpatterns.structural.adapter.TemperatureInfo;
import com.hanm.tpg.designpatterns.structural.adapter.TemperatureObjectReporter;
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
public class AdapterTest {

    private static TemperatureInfo temperatureInfo;
    public AdapterTest() {
    }

    @Test
    public void TempClassReporterTest() {
        
        temperatureInfo = new TemperatureClassReporter();
	testTemperatureInfo(temperatureInfo);
    }
    
    @Test
    public void TempObjectReporterTest() {
        
        temperatureInfo = new TemperatureObjectReporter();
	testTemperatureInfo(temperatureInfo);
    }

    public void testTemperatureInfo(TemperatureInfo temperatureInfo) {
        
        temperatureInfo.setTemperatureInC(0);
        Assert.assertEquals(temperatureInfo.getTemperatureInC(), 0.0, "Convertion from Celcius to Celcius failed!");
        Assert.assertEquals(temperatureInfo.getTemperatureInF(), 32.0, "Convertion from Celcius to Farenheit failed!");

        temperatureInfo.setTemperatureInF(85);
        Assert.assertEquals(temperatureInfo.getTemperatureInC(), 29.444444444444443, "Convertion from Farenheit to Celcius failed!");
        Assert.assertEquals(temperatureInfo.getTemperatureInF(), 85.0, "Convertion from Farenheit to Farenheit failed!");
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
