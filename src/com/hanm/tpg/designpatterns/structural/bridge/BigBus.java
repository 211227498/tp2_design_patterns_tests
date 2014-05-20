/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hanm.tpg.designpatterns.structural.bridge;

/**
 *
 * @author Hannes Morkel (211227498)
 */
public class BigBus extends Vehicle {

    public BigBus(Engine engine) {
        this.weightInKilos = 3000;
        this.engine = engine;
    }

    @Override
    public String drive() {
        System.out.println("\nThe big bus is driving");
        int horsepower = engine.go();
        return reportOnSpeed(horsepower);
    }
}
