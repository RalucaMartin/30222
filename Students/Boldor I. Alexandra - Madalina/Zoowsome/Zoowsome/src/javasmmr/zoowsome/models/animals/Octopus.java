package javasmmr.zoowsome.models.animals;

public class Octopus extends Aquatic {
	public Octopus(int nrOfLegs,String name,int avgSwimDepth,water waterType) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(waterType);	
	}
	public Octopus() {
		this(8,"Caracatita",1000,water.saltwater);
	}
}
