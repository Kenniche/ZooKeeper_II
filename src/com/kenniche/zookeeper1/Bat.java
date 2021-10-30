package com.kenniche.zookeeper1;

public class Bat extends Mammal {
	//Constructor method
	public Bat(int energyLevel) {
		super(energyLevel);
	}
	
	public void fly() {
		System.out.println("A bat taking off");
		energyLevel -= 50;
	}
	
	public void eatHumans() {
		System.out.println("Well, never mind");
		energyLevel += 25;
	}
	
	public void attackTown() {
		System.out.println("A town on fire");
		energyLevel -= 100;
	}
}