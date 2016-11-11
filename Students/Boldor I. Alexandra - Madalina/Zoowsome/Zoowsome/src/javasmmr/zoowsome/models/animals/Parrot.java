package javasmmr.zoowsome.models.animals;

public class Parrot extends Bird {
	public Parrot(int nrOfLegs,String name,Boolean migrates,int avgFlightAltitude) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		setMigrates(migrates);
		getAvgFlightAltitude(avgFlightAltitude);
	}
	public Parrot() {
		this(2,"Papagal",false,1200);
	}
	
}
