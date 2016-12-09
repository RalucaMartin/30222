package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Parrot extends Bird {
	public Parrot(int nrOfLegs, String name,  boolean migrates, int avgFlightAltitude) {
		super(0.4,0.0);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
	}
	public Parrot() {
		this(2, "Papagal", false, 10);
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
