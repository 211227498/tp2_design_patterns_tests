/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hanm.tpg.designpatterns.creational.builder;

/**
 *
 * @author Hannes Morkel (211227498)
 */
public interface MealBuilder {
	public void buildDrink();

	public void buildMainCourse();

	public void buildSide();

	public Meal getMeal();
}
