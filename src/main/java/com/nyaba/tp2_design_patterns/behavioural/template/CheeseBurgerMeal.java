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
public class CheeseBurgerMeal extends Meal{

    @Override
    public void prepareIngredients() {
        System.out.println("Getting ground beef and cheese");
    }

    @Override
    public void cook() {
        System.out.println("Cooking beef");
    }
    @Override
    public void eat(){
        System.out.println("The cheese burgers are tasty");
    }

    @Override
    public void cleanup() {
        System.out.println("Doing the dishes");
    }
    
}
