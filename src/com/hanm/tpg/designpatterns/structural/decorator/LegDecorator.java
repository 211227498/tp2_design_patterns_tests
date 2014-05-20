/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hanm.tpg.designpatterns.structural.decorator;

/**
 *
 * @author Hannes Morkel (211227498)
 */
public class LegDecorator extends AnimalDecorator {

    public LegDecorator(Animal animal) {
        super(animal);
    }

    @Override
    public String describe() {
        return animal.describe() + "\nI have legs." + dance();
    }

    public String dance() {
        return "\nI can dance.";
    }
}
