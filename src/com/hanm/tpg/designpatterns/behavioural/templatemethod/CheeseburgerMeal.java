/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hanm.tpg.designpatterns.behavioural.templatemethod;

/**
 *
 * @author Hannes Morkel (211227498)
 */
public class CheeseburgerMeal extends Meal {

    @Override
    public String prepareIngredients() {
        return "Getting ground beef and Cheese";
    }

    @Override
    public String cook() {
        return "Cooking ground beef in pan";
    }

    @Override
    public String eat() {
        return "The Cheese Burgers are tasty";
    }

    @Override
    public String cleanUp() {
        return "Doing the dishes";
    }
}
