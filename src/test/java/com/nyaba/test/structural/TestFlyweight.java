/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nyaba.test.structural;

import com.nyaba.tp2_design_patterns.structural.flyweight.Flyweight;
import com.nyaba.tp2_design_patterns.structural.flyweight.FlyweightFactory;
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
public class TestFlyweight {
    
    public TestFlyweight() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testingFlyweight() {
        FlyweightFactory flyweightFactory = FlyweightFactory.getInstance();
        Flyweight flyweightAdder = flyweightFactory.getFlyweight("add");
        int adder = flyweightAdder.doMath(5, 5);
        assertEquals(adder, 10);
        
        Flyweight flyweightMultiplier = flyweightFactory.getFlyweight("multiply");
        int multiply = flyweightMultiplier.doMath(2, 2);
        assertEquals(multiply, 4);
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
