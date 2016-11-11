package javasmmr.zoowsome.models.animals;

import javasmmr.zoowsome.models.animals.Constants.Animals;

public class Whale extends Aquatic {
	public Whale() {
		super();
		this.setName(Animals.Aquatics.WHALE);
		this.setNrOfLegs(0);
		this.avgSwimDepth=1500;
		this.waterType=Enum.Saltwater;
	}
}
