/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hanm.tpg.designpatterns.structural.adapter;

/**
 *
 * @author Hannes Morkel (211227498)
 */
public interface TemperatureInfo {

	public double getTemperatureInF();

	public void setTemperatureInF(double temperatureInF);

	public double getTemperatureInC();

	public void setTemperatureInC(double temperatureInC);

}
