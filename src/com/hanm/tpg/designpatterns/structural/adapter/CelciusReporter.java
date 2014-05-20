/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hanm.tpg.designpatterns.structural.adapter;

/**
 *
 * @author Hannes Morkel (211227498)
 */
public class CelciusReporter {

	double temperatureInC;

	public CelciusReporter() {
	}

	public double getTemperature() {
		return temperatureInC;
	}

	public void setTemperature(double temperatureInC) {
		this.temperatureInC = temperatureInC;
	}

}