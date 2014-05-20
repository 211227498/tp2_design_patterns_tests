/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hanm.tpg.designpatterns.structural.flyweight;

/**
 *
 * @author Hannes Morkel (211227498)
 */
public class FlyweightMultiplier implements Flyweight {

    String operation;

    public FlyweightMultiplier() {
        operation = "multiplying";
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int doMath(int a, int b) {
        System.out.println(operation + " " + a + " and " + b + ": " + (a * b));
        return a*b;
    }
}