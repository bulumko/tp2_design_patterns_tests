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
public abstract class Meal {
    public final void doMeal(){
        prepareIngredients();
        cook();
        eat();
        cleanup();
    }
    public abstract void prepareIngredients();
    public abstract void cook();
    public void eat(){
        System.out.println("Mmm, that's great");
    }
     public abstract void cleanup();
}
