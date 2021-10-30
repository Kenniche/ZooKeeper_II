package com.kenniche.zookeeper1;

public class Mammal {
	protected int energyLevel = 100;
	
	public int displayEnergy() {
		System.out.println("The Energy Level is: " + energyLevel);
		return energyLevel;
	}
	
	// Constructor method
	public Mammal(int energyLevel) {
		this.energyLevel = energyLevel;
	}
} // End of class Mammal