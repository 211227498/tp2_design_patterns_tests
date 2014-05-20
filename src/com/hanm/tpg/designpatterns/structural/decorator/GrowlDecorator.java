/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hanm.tpg.designpatterns.structural.decorator;

/**
 *
 * @author Hannes Morkel (211227498)
 */
public class GrowlDecorator extends AnimalDecorator {

    public GrowlDecorator(Animal animal) {
        super(animal);
    }

    @Override
    public String describe() {
        return animal.describe() + growl();
    }

    public String growl() {
        return "\nGrrrrr.";
    }
}
