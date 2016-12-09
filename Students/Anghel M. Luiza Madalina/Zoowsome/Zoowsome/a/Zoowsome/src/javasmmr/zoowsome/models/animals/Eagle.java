package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Eagle extends Bird {
	
	public Eagle(int legs, String name) {
		this.setNrOfLegs(legs);
		this.setName(name);
	}
	
	public Eagle() {
		this.setNrOfLegs(2);
		this.setName("Eagle");
		this.setMigrates(true);
		this.setAvgFlightAltitude(10000);
		this.setMaintenanceCost(5.3);
		this.setDangerPerc(0.4);
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
