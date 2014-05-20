/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hanm.tpg.designpatterns.creational.abstractfactory;

import com.hanm.tpg.designpatterns.creational.factorymethod.Animal;

/**
 *
 * @author Hannes Morkel (211227498)
 */
public class Tyrannosaurus extends Animal {

    @Override
    public String makeSound() {
        return "Roar";
    }
    
}
