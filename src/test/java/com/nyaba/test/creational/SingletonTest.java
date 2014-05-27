package com.nyaba.test.creational;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.nyaba.tp2_design_patterns.creational.singleton.Singleton;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author cnyaba
 */
public class SingletonTest {
    
    public SingletonTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void SingletonTest() {
        String hello = null;
        Singleton a =  Singleton.instance();
        
        hello = a.sayHello();
        
        assertEquals(hello, "Hello");
    }

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
