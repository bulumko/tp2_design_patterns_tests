/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nyaba.test.structural;

import com.nyaba.tp2_design_patterns.structural.Adapter.TemperatureClassReporter;
import com.nyaba.tp2_design_patterns.structural.Adapter.TemperatureInfo;
import com.nyaba.tp2_design_patterns.structural.Adapter.TemperatureObjectReporter;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author cnyaba
 */
public class TestAdapter {
    
    public TestAdapter() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void ClassAdapterTest() {
        TemperatureInfo temperatureInfo = new TemperatureClassReporter();
        temperatureInfo.setTemperatureInc(0);
        double temp = temperatureInfo.getTemperatureInc();
        assertEquals(temp, 0.0,"Temp in C");
        temp = temperatureInfo.getTemperatureInf();
        assertEquals(temp, 32.0, "Temp in F");
        //Testing Temperature using real number
        temperatureInfo.setTemperatureInf(40);
        temp = temperatureInfo.getTemperatureInf();
        assertEquals(temp, 40.0, "Temp in C");
        temp = temperatureInfo.getTemperatureInc();
        assertEquals(temp, 4.444444444444445, "Temp in C");
    }
    @Test
    public void objectAdapterTest(){
        TemperatureInfo temperatureInfo = new TemperatureObjectReporter();
        temperatureInfo.setTemperatureInc(0);
        double temp = temperatureInfo.getTemperatureInc();
        assertEquals(temp, 0.0,"Temp in C");
        temp = temperatureInfo.getTemperatureInf();
        assertEquals(temp, 32.0, "Temp in F");
        //Testing Temperature using real number
        temperatureInfo.setTemperatureInf(40);
        temp = temperatureInfo.getTemperatureInf();
        assertEquals(temp, 40.0, "Temp in C");
        temp = temperatureInfo.getTemperatureInc();
        assertEquals(temp, 4.444444444444445, "Temp in C");
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
