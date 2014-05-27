/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nyaba.test.creational;

import com.nyaba.tp2_design_patterns.creational.factorymethod.Animal;
import com.nyaba.tp2_design_patterns.creational.factorymethod.AnimalFactory;
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
public class TestFactoryMethod {
    
    public TestFactoryMethod() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void TestFactoryMethod() {
        AnimalFactory animalFactory = new AnimalFactory();
        
        //Test cat
        Animal a1 = animalFactory.getAnimal("feline");
        String feline = a1.makeSound();
        assertEquals(feline, "Meow");
        
        //test dog
        
        Animal a2 = animalFactory.getAnimal("canine");
        String canine = a2.makeSound();
        assertEquals(canine, "Woof");
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
