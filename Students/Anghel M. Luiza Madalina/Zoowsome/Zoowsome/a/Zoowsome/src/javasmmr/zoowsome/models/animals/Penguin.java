package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Penguin extends Bird {
	
	public Penguin(int legs, String name) {
		this.setNrOfLegs(legs);
		this.setName(name);
	}
	
	public Penguin() {
		this.setNrOfLegs(2);
		this.setName("Penguin");
		this.setMigrates(false);
		this.setAvgFlightAltitude(0);
		this.setMaintenanceCost(6.5);
		this.setDangerPerc(0.0);
	}
	
	@Override
	public boolean kill() {
		Random random = new Random();
		int i = random.nextInt(1);
		if(i < this.getDangerPerc()) {
			return true;
		} 	else return false;
	}
}
