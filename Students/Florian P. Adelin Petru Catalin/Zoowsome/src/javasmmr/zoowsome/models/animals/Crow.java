package javasmmr.zoowsome.models.animals;

import javasmmr.zoowsome.models.animals.Constants.Animals;

public class Crow extends Bird {
	public Crow() {
		super();
		this.setName(Animals.Birds.CROW);
		this.setNrOfLegs(4);
		this.avgFlightAltitude=1500;
		this.migrates=false;
	}
}
