/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nyaba.tp2_design_patterns.creational.abstractfactory;

import com.nyaba.tp2_design_patterns.creational.factorymethod.Animal;
import com.nyaba.tp2_design_patterns.creational.factorymethod.Cat;
import com.nyaba.tp2_design_patterns.creational.factorymethod.Dog;

/**
 *
 * @author cnyaba
 */
class MamalFactory extends SpeciesFactory {

    public MamalFactory() {
    }

    @Override
    public Animal getAnimal(String type) {
       if("dog".equals(type)){
           return new Dog();
       }
       else {
           return new Cat();
       }
    }
    
}
