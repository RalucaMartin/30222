package javasmmr.zoowsome.models.animals;

public class Swallow extends Bird{ //randunica

	public Swallow(int noOfLegs, String name, boolean migrates, int avgFlightAltitude){
		setNoOfLegs(noOfLegs);
		setName(name);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude); 
	
	}
	
	public Swallow(){
		this(2, "Randunica", true, 58);
	}

}
