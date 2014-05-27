/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nyaba.tp2_design_patterns.structural.bridge;

/**
 *
 * @author cnyaba
 */
public abstract class Vehicle {
    Engine engine;
    int weightInKilos;
    
    public abstract String drive();
    
    public void setEngine(Engine engine){
        this.engine = engine;
    }
    public String reportonSpeed(int hosePower){
        int ratio = weightInKilos / hosePower;
        if(ratio < 3){
            return "going faster";
        }
        else if((ratio >= 3) && ratio <8){
            return "going average";
        }
        else
            return "going slow";
    }
}
