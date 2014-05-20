/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hanm.tpg.designpatterns.creational.singleton;

/**
 *
 * @author Hannes Morkel (211227498)
 */

public class SingletonExample {
	private static SingletonExample singletonExample = null;

	private SingletonExample() {
	}

	public static SingletonExample getInstance() {
		if (singletonExample == null) {
			singletonExample = new SingletonExample();
		}
		return singletonExample;
	}

	public String sayHello() {
		return "Hello";
	}
}
