/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nyaba.test.creational;

import com.nyaba.tp2_design_patterns.creational.prototype.Person;
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
public class TestPrototype {
    
    public TestPrototype() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void TestingPrototype() {
            String name = null;
            Person person1 = new Person("Bulumko");
            name = person1.toString();
            assertEquals(name, "Bulumko");
            
            //Cloning person 1
            Person person2 = (Person)person1.doClone();
            String name2 = person2.toString();
            assertEquals(name2, "Bulumko");
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
