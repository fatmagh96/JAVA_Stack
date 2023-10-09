package com.codingdojo.zoo;

public class Mammal {
	protected int energyLevel;
	
	public Mammal() {
		this.energyLevel = 100;
	}
	
	
	public int dispalyEnergy() {
		System.out.println("energy level = " + this.energyLevel);
		return this.energyLevel;
	}
	
	
	// Getters and Setters	

	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	

}
