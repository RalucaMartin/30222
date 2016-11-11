package javasmmr.zoowesome.models.animals;

public class Crow extends Bird {
	
	public Crow() {
		setNrOfLegs(2);
		setName("Bip");
		migrates = true;
		avgFlightAltitude = 150;
	}
	
	public Crow( String name, Boolean migrates, Integer avgFlightAltitude) {
		setName(name);
		this.migrates = migrates;
		this.avgFlightAltitude = avgFlightAltitude ;
	}

}