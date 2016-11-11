package javasmmr.zoowsome.models.animals;

import javasmmr.zoowsome.models.animals.Constants.Animals;

public class Alligator extends Reptile {
	public Alligator() {
		super();
		this.setName(Animals.Reptiles.ALLIGATOR);
		this.setNrOfLegs(4);
		this.layEggs=true;
	}
}
