package javasmmr.zoowsome.models.animals;

import javasmmr.zoowsome.models.animals.Constants.Animals;

public class Spider extends Insect {
	public Spider() {
		super();
		this.setNrOfLegs(8);
		this.setName(Animals.Insects.SPIDER);
		this.canFly=false;
		this.isDangerous=true;
	}
}
