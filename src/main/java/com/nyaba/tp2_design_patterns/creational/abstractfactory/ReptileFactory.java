/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nyaba.tp2_design_patterns.creational.abstractfactory;

import com.nyaba.tp2_design_patterns.creational.factorymethod.Animal;

/**
 *
 * @author cnyaba
 */
class ReptileFactory extends SpeciesFactory {

    public ReptileFactory() {
    }

    @Override
    public Animal getAnimal(String type) {
        if("snake".equals(type)){
            return new Snake();
        }
        else{
           return new Tyrannosaurus(); 
        }
    }
    
}
