package com.dunzo.chaipoint.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GreenTea implements Beverage {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int hotWater;
	private int gingerSyrup;
	private int sugarSyrup;
	private int greenMixture;

	public GreenTea(int hotWater, int gingerSyrup, int sugarSyrup, int greenMixture) {
		this.hotWater = hotWater;
		this.gingerSyrup = gingerSyrup;
		this.sugarSyrup = sugarSyrup;
		this.greenMixture = greenMixture;
	}

	public int getHotWater() {
		return hotWater;
	}

	public void setHotWater(int hotWater) {
		this.hotWater = hotWater;
	}

	public int getGingerSyrup() {
		return gingerSyrup;
	}

	public void setGingerSyrup(int gingerSyrup) {
		this.gingerSyrup = gingerSyrup;
	}

	public int getSugarSyrup() {
		return sugarSyrup;
	}

	public void setSugarSyrup(int sugarSyrup) {
		this.sugarSyrup = sugarSyrup;
	}

	public int getGreenMixture() {
		return greenMixture;
	}

	public void setGreenMixture(int greenMixture) {
		this.greenMixture = greenMixture;
	}

}
