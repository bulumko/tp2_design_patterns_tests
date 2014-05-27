/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nyaba.tp2_design_patterns.structural.flyweight;

/**
 *
 * @author cnyaba
 */
public class FlyWeightMultiplier implements Flyweight{
    String operation;
    
    public FlyWeightMultiplier(){
        operation = "multiplier";
        try{
            Thread.sleep(3000);
        }
        catch(InterruptedException e){
            
        }
    }
    @Override
    public int doMath(int a, int b) {
       return(a*b);
    }
    
}
