/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hanm.tpg.designpatterns.structural.bridge;

/**
 *
 * @author Hannes Morkel (211227498)
 */
public class SmallCar extends Vehicle {

    public SmallCar(Engine engine) {
        this.weightInKilos = 600;
        this.engine = engine;
    }

    @Override
    public String drive() {
        System.out.println("\nThe small car is driving");
        int horsepower = engine.go();
        return reportOnSpeed(horsepower);
    }
}
