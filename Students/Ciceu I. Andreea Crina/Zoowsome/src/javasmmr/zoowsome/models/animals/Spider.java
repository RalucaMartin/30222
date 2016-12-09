package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Spider extends Insects{

	public Spider(int nrOfLegs, String name, boolean canFly, boolean isDangerous){
		super(0.8,5.0);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setCanFly(canFly);
		setIsDangerous(isDangerous);
	}
	public Spider() {
		this (10, "Paianjen", false, false); 
	
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
