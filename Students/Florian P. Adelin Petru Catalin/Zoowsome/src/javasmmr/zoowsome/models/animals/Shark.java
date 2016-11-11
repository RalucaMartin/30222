package javasmmr.zoowsome.models.animals;

import javasmmr.zoowsome.models.animals.Constants.Animals;

public class Shark extends Aquatic {
	public Shark() {
		super();
		this.setName(Animals.Aquatics.SHARK);
		this.setNrOfLegs(0);
		this.avgSwimDepth=1000;
		this.waterType=Enum.Saltwater;
	}
}
