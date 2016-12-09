package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Tiger extends Mammal {
	public Tiger (int nrOfLegs, String name, float normalBodyTemp, float percBodyHair) {
		super(1.0,8.0);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair(percBodyHair);
	}
	public Tiger() {
		this (4,"Tiger", 37, 50);
	}
	
	public boolean kill() {
		Random random = new Random();
		int ran = random.nextInt(10);
		if((ran/10) < dangerPerc) {
			return true;
		} 
		else {
			return false;
		}
	}

}
