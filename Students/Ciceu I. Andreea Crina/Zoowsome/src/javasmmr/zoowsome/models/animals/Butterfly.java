package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Butterfly extends Insects {
	
	public Butterfly(int nrOfLegs, String name, boolean canFly, boolean isDangerous){
		super(0.1,0.0);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setCanFly(canFly);
		setIsDangerous(isDangerous);
	}
	public Butterfly() {
		this (3, "Fluturas", true, false);
	}
	public boolean kill(){
		
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
