package com.dunzo.chaipoint.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BlackTea implements Beverage {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int hotWater;
	private int gingerSyrup;
	private int sugarSyrup;
	private int teaLeavesSyrup;

	public BlackTea(int hotWater, int gingerSyrup, int sugarSyrup, int teaLeavesSyrup) {
		this.hotWater = hotWater;
		this.gingerSyrup = gingerSyrup;
		this.sugarSyrup = sugarSyrup;
		this.teaLeavesSyrup = teaLeavesSyrup;
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

	public int getTeaLeavesSyrup() {
		return teaLeavesSyrup;
	}

	public void setTeaLeavesSyrup(int teaLeavesSyrup) {
		this.teaLeavesSyrup = teaLeavesSyrup;
	}

}
