/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hanm.tpg.designpatterns.behavioural.templatemethod;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Hannes Morkel (211227498)
 */
public abstract class Meal {

    public final Map<String, String> doMeal() {
        
        Map<String, String> mealValues = new HashMap<String, String>();
        mealValues.put("prepareIngredients", prepareIngredients());
        mealValues.put("cook", cook());
        mealValues.put("eat", eat());
        mealValues.put("cleanUp", cleanUp());
        
        return mealValues;
    }

    public abstract String prepareIngredients();

    public abstract String cook();

    public String eat() {
        
        return "Mmm, that's good";
    }

    public abstract String cleanUp();
}
