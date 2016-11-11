package javasmmr.zoowsome.models.animals;

public class Stork extends Bird{
	public Stork(int nrOfLegs,String name,Boolean migrates,int avgFlightAltitude) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		setMigrates(migrates);
		getAvgFlightAltitude(avgFlightAltitude);
	}
	public Stork() {
		this(2,"Barza",true,500);
	}

}
