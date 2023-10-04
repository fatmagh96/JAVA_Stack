package com.codingdojo.zoo;

public class Gorilla extends Mammal {
//	public Gorilla() {
//		super();
//	}

	public void throwSomthing() {
		System.out.println("**throwing something**");
		this.setEnergyLevel(this.getEnergyLevel()-5);
	}

	public void eatBanana() {
		System.out.println("**eating a banana miam miam**");
		this.setEnergyLevel(getEnergyLevel()+10);
	}

	public void climb() {
		System.out.println("**Climbing a tree**");
		this.setEnergyLevel(getEnergyLevel()-10);
	}

}
