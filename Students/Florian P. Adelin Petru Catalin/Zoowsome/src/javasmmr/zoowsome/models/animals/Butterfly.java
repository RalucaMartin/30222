package javasmmr.zoowsome.models.animals;

import javasmmr.zoowsome.models.animals.Constants.Animals;

public class Butterfly extends Insect {
	public Butterfly() {
		super();
		this.setNrOfLegs(8);
		this.setName(Animals.Insects.BUTTERFLY);
		this.canFly=true;
		this.isDangerous=false;
	}
}
