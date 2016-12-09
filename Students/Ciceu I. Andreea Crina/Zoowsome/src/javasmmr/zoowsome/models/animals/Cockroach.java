package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Cockroach extends Insects {

	public Cockroach(int nrOfLegs, String name, boolean canFly, boolean isDangerous){
		super(0.1,0.7);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setCanFly(canFly);
		setIsDangerous(isDangerous);
	}
	public Cockroach () {
		this (4, "Gandac", false, true); 
	
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
