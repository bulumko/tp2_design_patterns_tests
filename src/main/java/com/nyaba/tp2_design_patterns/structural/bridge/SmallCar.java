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
public class SmallCar extends Vehicle{
    public SmallCar(Engine engine){
        this.weightInKilos = 600;
        this.engine = engine;
    }
    @Override
    public String drive() {
        int horsepower = engine.go();
        return reportonSpeed(horsepower);
    }
}
