package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Fish extends Aquatic{
	public Fish ( int nrOfLegs, String name, int avgSwimDepth, waterType water) {
		super(0.2, 0.1);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
		setWater(water);
	}
	public Fish(){
		this (0, "GoldFish", 200, waterType.freshWater);
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
