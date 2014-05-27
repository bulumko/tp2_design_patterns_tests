/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nyaba.tp2_design_patterns.behavioural.template;

/**
 *
 * @author cnyaba
 */
public class HamburgerMeal extends Meal{

    @Override
    public void prepareIngredients() {
       System.out.println("Getting burgers, buns french fries");
    }

    @Override
    public void cook() {
        System.out.println("cooking burger");
    }

    @Override
    public void cleanup() {
       System.out.println("Throwing away paper plates");
    }
    
}
