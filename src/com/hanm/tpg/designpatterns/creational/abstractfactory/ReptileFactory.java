/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hanm.tpg.designpatterns.creational.abstractfactory;

import com.hanm.tpg.designpatterns.creational.factorymethod.Animal;

/**
 *
 * @author Hannes Morkel (211227498)
 */
public class ReptileFactory extends SpeciesFactory {

	@Override
	public Animal getAnimal(String type) {
		if ("snake".equals(type)) {
			return new Snake();
		} else {
			return new Tyrannosaurus();
		}
	}

}
