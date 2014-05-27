/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nyaba.tp2_design_patterns.creational.abstractfactory;

/**
 *
 * @author cnyaba
 */
public class AbstractFactory {
    
    /**
     *
     * @param type
     * @return
     */
    public SpeciesFactory getSpecies(String type){
        if("mammal".equals(type)){
            return new MamalFactory();
        }
        else {
            return new ReptileFactory();
        }
    }
}
