package javasmmr.zoowsome.models.animals;

public class Dove extends Bird{//porumbel

	public Dove(int noOfLegs, String name, boolean migrates, int avgFlightAltitude){
		setNoOfLegs(noOfLegs);
		setName(name);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
	}
	
	public Dove() {
		// TODO Auto-generated constructor stub
		this(2, "Porumbel", false, 30);
	}

}
