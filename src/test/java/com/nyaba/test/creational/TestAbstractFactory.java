/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nyaba.test.creational;

import com.nyaba.tp2_design_patterns.creational.abstractfactory.AbstractFactory;
import com.nyaba.tp2_design_patterns.creational.abstractfactory.SpeciesFactory;
import com.nyaba.tp2_design_patterns.creational.factorymethod.Animal;
import org.testng.Assert;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author cnyaba
 */
public class TestAbstractFactory {
    
    public TestAbstractFactory() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testReptile() {
        AbstractFactory abstractFactory = new AbstractFactory();
        
        SpeciesFactory speciesFactory1 = abstractFactory.getSpecies("reptile");
        Animal a1 = speciesFactory1.getAnimal("tyrannosaurus");
        String sound = a1.makeSound();
        assertEquals(sound, "Roar");
        
        SpeciesFactory speciesFactory2 = abstractFactory.getSpecies("reptile");
        Animal a2 = speciesFactory2.getAnimal("snake");
        String soundSnake = a2.makeSound();
        assertEquals(soundSnake, "Hiss");
    }
    @Test
    public void testMamal(){
        AbstractFactory abstractFactory = new AbstractFactory();
        
        SpeciesFactory speciesFactory3 = abstractFactory.getSpecies("mammal");
        Animal a3 = speciesFactory3.getAnimal("dog");
        String dog = a3.makeSound();
        assertEquals(dog, "Woof");
        
        SpeciesFactory speciesFactory4 = abstractFactory.getSpecies("mammal");
        Animal a4 = speciesFactory4.getAnimal("cat");
        String cat = a4.makeSound();
        assertEquals(cat, "Meow");
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
