package javasmmr.zoowsome.models.animals;

public class Fish extends Aquatic{
	public Fish ( int nrOfLegs, String name, int avgSwimDepth, waterType water) {
		
		setNrOfLegs(nrOfLegs);
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
		setWater(water);
	}
	public Fish(){
		this (0, "GoldFish", 200, waterType.freshWater);
	}

}
