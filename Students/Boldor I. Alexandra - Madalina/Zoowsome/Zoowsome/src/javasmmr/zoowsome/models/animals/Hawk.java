package javasmmr.zoowsome.models.animals;

public class Hawk extends Bird {
	public Hawk(int nrOfLegs,String name,Boolean migrates,int avgFlightAltitude) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		setMigrates(migrates);
		getAvgFlightAltitude(avgFlightAltitude);
	}
	public Hawk() {
		this(2,"Soim",false,1800);
	}

}
