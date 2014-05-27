/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nyaba.tp2_design_patterns.structural.Adapter;

/**
 *
 * @author cnyaba
 */
public class CelciusReporter {
    double temperatureInc;
    
    public CelciusReporter(){
        
    }
    public double getTemperature(){
        return temperatureInc;
    }
    public void setTempereture(double temperatureInc){
        this.temperatureInc = temperatureInc;
    }
}
