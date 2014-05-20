/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hanm.tpg.designpatterns.structural.decorator;

/**
 *
 * @author Hannes Morkel (211227498)
 */
public class LivingAnimal implements Animal {

    @Override
    public String describe() {
        return "\nI am an animal.";
    }
}
