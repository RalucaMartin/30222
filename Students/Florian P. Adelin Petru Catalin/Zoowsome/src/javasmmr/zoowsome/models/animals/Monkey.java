package javasmmr.zoowsome.models.animals;

import javasmmr.zoowsome.models.animals.Constants.Animals;

public class Monkey extends Mammal {
	public Monkey() {
		super();
		this.setNrOfLegs(4);
		this.setName(Animals.Mammals.MONKEY);
		this.normalBodyTemp=40;
		this.percBodyHair=95;
	}
}
