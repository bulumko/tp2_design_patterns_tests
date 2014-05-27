/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nyaba.tp2_design_patterns.structural.Composite;

/**
 *
 * @author cnyaba
 */
public class Leaf implements Component{
    String name;
    
    public Leaf(String name){
        this.name = name;
    }
    @Override
    public void sayHello() {
        String greeting = " hello";        
        greeting = name + greeting;
    }

    @Override
    public void sayGoodbye() {
        String greeting = " goodbye";        
        greeting = name + greeting;
    }
    
}
