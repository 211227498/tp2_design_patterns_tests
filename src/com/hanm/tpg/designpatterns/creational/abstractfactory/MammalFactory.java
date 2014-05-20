/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hanm.tpg.designpatterns.creational.abstractfactory;

import com.hanm.tpg.designpatterns.creational.factorymethod.Animal;
import com.hanm.tpg.designpatterns.creational.factorymethod.Cat;
import com.hanm.tpg.designpatterns.creational.factorymethod.Dog;

/**
 *
 * @author Hannes Morkel (211227498)
 */
public class MammalFactory extends SpeciesFactory {

	@Override
	public Animal getAnimal(String type) {
		if ("dog".equals(type)) {
			return new Dog();
		} else {
			return new Cat();
		}
	}
}
