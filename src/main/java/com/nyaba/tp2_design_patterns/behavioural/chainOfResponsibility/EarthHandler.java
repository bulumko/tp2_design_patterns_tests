/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nyaba.tp2_design_patterns.behavioural.chainOfResponsibility;

/**
 *
 * @author cnyaba
 */
public class EarthHandler extends PlanetHandler{

    @Override
    public void handleRequest(PlanetEnum request) {
       if(request == PlanetEnum.EARTH){
           System.out.println("Handling earth");
       }
       else{
           System.out.println("Earth handler does not handle this");
           if(successor != null){
               successor.handleRequest(request);
           }
       }
    }
    
}
