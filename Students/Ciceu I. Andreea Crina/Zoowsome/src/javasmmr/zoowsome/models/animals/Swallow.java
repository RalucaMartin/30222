package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Swallow extends Bird {
	
	public Swallow(int nrOfLegs, String name,  boolean migrates, int avgFlightAltitude) {
		super(0.3,0.0);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
	}
	public Swallow() {
		this(2, "Randunica", true, 100);
	}
	public boolean kill() {
		Random random = new Random();
		int ran = random.nextInt(10);
		if((ran/10) < dangerPerc) {
			return true;
		} 
		else {
			return false;
		}
	}
}
