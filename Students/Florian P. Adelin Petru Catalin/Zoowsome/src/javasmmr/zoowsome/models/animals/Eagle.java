package javasmmr.zoowsome.models.animals;

import javasmmr.zoowsome.models.animals.Constants.Animals;

public class Eagle extends Bird {
	public Eagle() {
		super();
		this.setName(Animals.Birds.EAGLE);
		this.setNrOfLegs(4);
		this.avgFlightAltitude=1500;
		this.migrates=false;
	}
}
