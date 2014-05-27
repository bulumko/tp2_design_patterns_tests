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
public class TemperatureObjectReporter implements TemperatureInfo{
    CelciusReporter celciusReporter;
    
    public TemperatureObjectReporter(){
        celciusReporter = new CelciusReporter();
    }
    @Override
    public double getTemperatureInf() {
       return cToF(celciusReporter.getTemperature());
    }

    @Override
    public void setTemperatureInf(double temperatureInf) {
        celciusReporter.setTempereture(fToC(temperatureInf));
    }

    @Override
    public double getTemperatureInc() {
        return celciusReporter.getTemperature();
    }

    @Override
    public void setTemperatureInc(double temperatureInc) {
        celciusReporter.setTempereture(temperatureInc);
    }
    private double fToC(double f){
        return ((f - 32) *5 / 9);
    }
    private double cToF(double c){
        return ((c * 9 / 5) +32);
    }
    
}
