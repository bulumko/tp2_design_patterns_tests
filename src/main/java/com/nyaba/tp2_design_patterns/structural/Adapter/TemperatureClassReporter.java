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
public class TemperatureClassReporter extends CelciusReporter implements TemperatureInfo{

    @Override
    public double getTemperatureInf() {
        return cToF(temperatureInc);
    }

    @Override
    public void setTemperatureInf(double temperatureInf) {
        this.temperatureInc = fToC(temperatureInf);
    }

    @Override
    public double getTemperatureInc() {
       return temperatureInc;
    }

    @Override
    public void setTemperatureInc(double temperatureInc) {
        this.temperatureInc = temperatureInc;
    }
    private double fToC(double f){
        return ((f - 32) * 5 / 9);
    }
    private double cToF(double c){
        return ((c * 9 / 5) +32);
    }
    
}
