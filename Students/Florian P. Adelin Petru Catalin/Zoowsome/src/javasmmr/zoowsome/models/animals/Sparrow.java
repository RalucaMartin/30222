package javasmmr.zoowsome.models.animals;

import javasmmr.zoowsome.models.animals.Constants.Animals;

public class Sparrow extends Bird {
	public Sparrow() {
		super();
		this.setName(Animals.Birds.SPARROW);
		this.setNrOfLegs(4);
		this.avgFlightAltitude=800;
		this.migrates=false;
	}
}
