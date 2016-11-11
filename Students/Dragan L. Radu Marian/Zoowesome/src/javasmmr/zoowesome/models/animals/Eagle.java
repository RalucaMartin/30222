package javasmmr.zoowesome.models.animals;

public class Eagle extends Bird {
	
	public Eagle() {
		setNrOfLegs(2);
		setName("King");
		migrates = false;
		avgFlightAltitude = 10000;
	}
	
	public Eagle( String name, Boolean migrates, Integer avgFlightAltitude) {
		setName(name);
		this.migrates = migrates;
		this.avgFlightAltitude = avgFlightAltitude ;
	}

}
