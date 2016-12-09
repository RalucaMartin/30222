package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Flamingo extends Bird {
	
	public Flamingo(int legs, String name) {
		this.setNrOfLegs(legs);
		this.setName(name);
	}
	
	public Flamingo() {
		this.setNrOfLegs(2);
		this.setName("Flamingo");
		this.setMigrates(true);
		this.setAvgFlightAltitude(8000);
		this.setMaintenanceCost(7.5);
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
