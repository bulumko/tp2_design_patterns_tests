/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nyaba.test.creational;

import com.nyaba.tp2_design_patterns.creational.builderpattern.ItalianMealBuilder;
import com.nyaba.tp2_design_patterns.creational.builderpattern.JapaneseMealBuilder;
import com.nyaba.tp2_design_patterns.creational.builderpattern.Meal;
import com.nyaba.tp2_design_patterns.creational.builderpattern.MealBuilder;
import com.nyaba.tp2_design_patterns.creational.builderpattern.MealDirector;
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
public class TestBuilderPattern {
    
    public TestBuilderPattern() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void createItalianMeal() {
        MealBuilder mealBuilder = new ItalianMealBuilder();
        MealDirector mealDirector = new MealDirector(mealBuilder);
        mealDirector.constructMeal();
        Meal meal = mealDirector.getMeal();
        String drink = meal.getDrink();
        String mainCourse = meal.getMainCourse();
        String side = meal.getSide();
        
        assertEquals(drink, "red wine");
        assertEquals(mainCourse, "pizza");
        assertEquals(side, "bread");
    }
    @Test
    public void createJapaneseMeal(){
        MealBuilder mealBuilder = new JapaneseMealBuilder();
        MealDirector mealDirector = new MealDirector(mealBuilder);
        mealDirector.constructMeal();
        Meal meal = mealDirector.getMeal();
        String drink = meal.getDrink();
        String mainCourse = meal.getMainCourse();
        String side = meal.getSide();
        
        assertEquals(drink, "sake");
        assertEquals(mainCourse, "chicken teriyaki");
        assertEquals(side, "miso soup");
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
