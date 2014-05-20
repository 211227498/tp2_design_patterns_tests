/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hanm.tpg.designpatterns.structural.decorator;

/**
 *
 * @author Hannes Morkel (211227498)
 */
public class WingDecorator extends AnimalDecorator {

    public WingDecorator(Animal animal) {
        super(animal);
    }

    @Override
    public String describe() {
        return animal.describe() + "\nI have wings." + fly();
    }

    public String fly() {
        return "\nI can fly.";
    }
}
