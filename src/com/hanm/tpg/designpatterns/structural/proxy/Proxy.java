/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hanm.tpg.designpatterns.structural.proxy;

/**
 *
 * @author Hannes Morkel (211227498)
 */
import java.util.Date;

public class Proxy {

    SlowThing slowThing;

    public Proxy() {
    }

    public Date sayHello() {
        if (slowThing == null) {
            slowThing = new SlowThing();
        }
        return slowThing.sayHello();
    }
}
