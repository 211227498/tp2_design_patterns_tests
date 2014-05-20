/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hanm.tpg.designpatterns.structural.proxy;

import java.util.Date;

/**
 *
 * @author Hannes Morkel (211227498)
 */
public abstract class Thing {

    public Date sayHello() {
        Date date = new Date();
        System.out.println(this.getClass().getSimpleName() + " says howdy at " + date);
        return date;
    }

}
