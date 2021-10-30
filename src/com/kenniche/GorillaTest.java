package com.kenniche;

import com.kenniche.zookeeper1.Gorilla;
import com.kenniche.zookeeper1.Mammal;

public class GorillaTest {

	public static void main(String args[]) {

		// Create a new object named myGorilla
		Gorilla myGorilla = new Gorilla(100);
		
		// Call the method throwSomething three times
		myGorilla.throwSomething();
		myGorilla.throwSomething();
		myGorilla.throwSomething();
		
		// MyGorilla class overrides the instance method in Mammal	
		Mammal myMammal = myGorilla;
		myMammal.displayEnergy();
		
		// Call the method eatBananas two times
		myGorilla.eatBananas();
		myGorilla.eatBananas();
		myMammal.displayEnergy();
		
		// Call the method climb one time
		myGorilla.climb();
		myMammal.displayEnergy();
	}
}// End of class GorillaTest
