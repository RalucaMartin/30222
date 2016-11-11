package javasmmr.zoowsome.models.animals;

public class Fish extends Aquatic {
	public Fish(int nrOfLegs, String name, Integer avgSwimDepth, water waterType) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(waterType);
	}

	public Fish() {
		this(0, "Somon", 500, water.saltWater);
	}
}
