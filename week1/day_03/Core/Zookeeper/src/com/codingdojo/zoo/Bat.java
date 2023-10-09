package com.codingdojo.zoo;

public class Bat extends Mammal {

	public Bat() {
		this.energyLevel = 300;
	}

	public void fly() {
		System.out.println("**click click**");
		this.setEnergyLevel(energyLevel-50);
	}

	public void eatHumans() {
		System.out.println("**nom nom nom**");
		this.setEnergyLevel(energyLevel+25);
	}

	public void attackTown() {
		System.out.println("**5och 5och 5och**");
		this.setEnergyLevel(energyLevel-100);
	}
}
