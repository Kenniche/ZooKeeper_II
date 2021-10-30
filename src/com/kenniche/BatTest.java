package com.kenniche;

import com.kenniche.zookeeper1.Bat;
import com.kenniche.zookeeper1.Mammal;

public class BatTest {

	public static void main(String[] args) {
		// Create a new object named myBat
		Bat myBat = new Bat(300);
		
		// Call the method attackTown three times
		myBat.attackTown();
		myBat.attackTown();
		myBat.attackTown();
		
		// MyBat class overrides the instance method in Mammal	
		Mammal myMammal = myBat;
		myMammal.displayEnergy();
		
		// Call the method eatHumans two times
		myBat.eatHumans();
		myBat.eatHumans();
		
		myMammal.displayEnergy();
		
		// Call the method Fly 
		myBat.fly();
		myBat.fly();
		myMammal.displayEnergy();

	}

}// End of class BatTest

