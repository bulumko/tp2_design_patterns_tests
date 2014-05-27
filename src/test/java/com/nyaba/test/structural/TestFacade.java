/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nyaba.test.structural;

import com.nyaba.tp2_design_patterns.structural.facade.Facade;
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
public class TestFacade {
    
    public TestFacade() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testingFacade() {
        
        Facade facade = new Facade();
        int cubeX = facade.cubeX(3);
        assertEquals(cubeX, 27,"CubeX");
        int cubexTimes2 = facade.cubeXTimes2(3);
        assertEquals(cubexTimes2, 54,"CubeXTImes2");
        int xtoSixthPowerTimes2 = facade.xToSixthPowerTimes2(3);
        assertEquals(xtoSixthPowerTimes2, 1458);
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
