/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nyaba.tp2_design_patterns.creational.prototype;

/**
 *
 * @author cnyaba
 */
public class Dog implements Prototype{
    String sound;
    
    public Dog(String sound){
        this.sound = sound;
    }
    @Override
    public Prototype doClone() {
       return new Dog(sound);
    }
    public String toString(){
        return sound;
    }
    
}
