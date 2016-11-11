package javasmmr.zoowsome.models.animals;

public class Carp extends Aquatic{
	public Carp(int nrOfLegs,String name,int avgSwimDepth,water waterType) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(waterType);	
	}
	public Carp() {
		this(0,"Crap",40,water.freshwater);
	}

}
