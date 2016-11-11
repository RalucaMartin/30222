package javasmmr.zoowsome.models.animals;

import javasmmr.zoowsome.models.animals.Constants.Animals;

public class Dolphin extends Aquatic {
	public Dolphin() {
		super();
		this.setName(Animals.Aquatics.DOLPHIN);
		this.setNrOfLegs(0);
		this.avgSwimDepth=1500;
		this.waterType=Enum.Saltwater;
	}
}
