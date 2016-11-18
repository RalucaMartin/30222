package javasmmr.zoowsome.models.animals;

public class Octopus extends Aquatic {

	public Octopus(int nrOfLegs, String name, Integer avgSwimDepth, water waterType) {
		super(1, 0.1);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(waterType);
	}

	public Octopus() {
		this(10, "Octopus", 2000, water.saltWater);
	}
}
