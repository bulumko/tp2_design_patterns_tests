/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nyaba.test.structural;

import com.nyaba.tp2_design_patterns.structural.bridge.BigBus;
import com.nyaba.tp2_design_patterns.structural.bridge.BigEngine;
import com.nyaba.tp2_design_patterns.structural.bridge.SmallCar;
import com.nyaba.tp2_design_patterns.structural.bridge.SmallEngine;
import com.nyaba.tp2_design_patterns.structural.bridge.Vehicle;
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
public class TestBridge {
    
    public TestBridge() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testingBridge() {
        String bigBusSmallEngine = null;
        Vehicle vehicle = new BigBus(new SmallEngine());
        bigBusSmallEngine = vehicle.drive();
        
        assertEquals(bigBusSmallEngine, "going slow");
        
        vehicle.setEngine(new BigEngine());
        String bigBusBigEngine = vehicle.drive();
        assertEquals(bigBusBigEngine, "going slow");
        
        vehicle = new SmallCar(new SmallEngine());
        String smalCarSmallEngine = vehicle.drive();
        assertEquals(smalCarSmallEngine, "going average");
        
        vehicle.setEngine(new BigEngine());
        String smallCarBigEngine = vehicle.drive();
        assertEquals(smallCarBigEngine, "going faster");
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
