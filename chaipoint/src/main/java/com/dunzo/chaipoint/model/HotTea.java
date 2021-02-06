package com.dunzo.chaipoint.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HotTea implements Beverage {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int hotWater;
	private int hotMilk;
	private int gingerSyrup;
	private int sugarSyrup;
	private int teaLeavesSyrup;

	public HotTea(int hotWater, int hotMilk, int gingerSyrup, int sugarSyrup, int teaLeavesSyrup) {
		this.hotWater = hotWater;
		this.hotMilk = hotMilk;
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

	public int getHotMilk() {
		return hotMilk;
	}

	public void setHotMilk(int hotMilk) {
		this.hotMilk = hotMilk;
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
