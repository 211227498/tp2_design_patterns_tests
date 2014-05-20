/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hanm.tpg.designpatterns.creational.factorymethod;

/**
 *
 * @author Hannes Morkel (211227498)
 */
public class AnimalFactory {

	public Animal getAnimal(String type) {
		if ("canine".equals(type)) {
			return new Dog();
		} else {
			return new Cat();
		}
	}

}
