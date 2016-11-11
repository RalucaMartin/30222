package javasmmr.zoowsome.models.animals;

import javasmmr.zoowsome.models.animals.Constants.Animals;

public class Cow extends Mammal {
	public Cow() {
		super();
		this.setNrOfLegs(4);
		this.setName(Animals.Mammals.COW);
		this.normalBodyTemp=40;
		this.percBodyHair=95;
	}
}
