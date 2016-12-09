package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Crow extends Bird {
	public Crow(int nrOfLegs, String name,  boolean migrates, int avgFlightAltitude) {
		super(0.2,0.1);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
	}
	public Crow() {
		this(2, "Cioara", true, 100);
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
