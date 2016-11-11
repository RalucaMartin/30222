package javasmmr.zoowesome.models.animals;

public class Woodpecker extends Bird {
	
	public Woodpecker() {
		setNrOfLegs(2);
		setName("Woody");
		migrates = false;
		avgFlightAltitude = 100;
	}
	
	public Woodpecker( String name, Boolean migrates, Integer avgFlightAltitude) {
		setName(name);
		this.migrates = migrates;
		this.avgFlightAltitude = avgFlightAltitude ;
	}

}