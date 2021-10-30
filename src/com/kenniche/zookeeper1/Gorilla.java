package com.kenniche.zookeeper1;

public class Gorilla extends Mammal {
	//Constructor method
	public Gorilla(int energyLevel) {
		super(energyLevel);
	}
	
	public void throwSomething() {
		System.out.println("The Gorilla is Throwing sommething");
		energyLevel -= 5;
	}
	
	public void eatBananas() {
		System.out.println("The Gorilla is Eating bananas");
		energyLevel += 10;
	}
	
	public void climb() {
		System.out.println("The Gorilla is Climbing");
		energyLevel -= 10;
	}
}// End of class Gorilla