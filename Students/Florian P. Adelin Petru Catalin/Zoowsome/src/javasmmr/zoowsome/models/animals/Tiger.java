package javasmmr.zoowsome.models.animals;

import javasmmr.zoowsome.models.animals.Constants.Animals;

public class Tiger extends Mammal {

	public Tiger() {
		super();
		this.setNrOfLegs(4);
		this.setName(Animals.Mammals.TIGER);
		this.normalBodyTemp=40;
		this.percBodyHair=95;
	}
}
