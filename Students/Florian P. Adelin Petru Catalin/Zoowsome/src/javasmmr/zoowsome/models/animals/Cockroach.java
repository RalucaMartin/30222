package javasmmr.zoowsome.models.animals;

import javasmmr.zoowsome.models.animals.Constants.Animals;

public class Cockroach extends Insect {
	public Cockroach() {
		super();
		this.setNrOfLegs(8);
		this.setName(Animals.Insects.COCKROACH);
		this.canFly=false;
		this.isDangerous=false;
	}
}
