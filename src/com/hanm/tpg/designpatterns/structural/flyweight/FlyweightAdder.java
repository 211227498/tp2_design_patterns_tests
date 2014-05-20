/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hanm.tpg.designpatterns.structural.flyweight;

/**
 *
 * @author Hannes Morkel (211227498)
 */
public class FlyweightAdder implements Flyweight {

    String operation;

    public FlyweightAdder() {
        operation = "adding";
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int doMath(int a, int b) {
        System.out.println(operation + " " + a + " and " + b + ": " + (a + b));
        return (a+b);
    }
}
