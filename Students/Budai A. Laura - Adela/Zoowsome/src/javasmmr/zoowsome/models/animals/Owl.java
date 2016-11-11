package javasmmr.zoowsome.models.animals;

public class Owl extends Bird {
	
	public Owl(){
		super();
		this.setNrOfLegs(2);
		this.setName("Owl");
		this.setMigrates(false);
		this.setAvgFlightAltitude(2000);
	}
}
