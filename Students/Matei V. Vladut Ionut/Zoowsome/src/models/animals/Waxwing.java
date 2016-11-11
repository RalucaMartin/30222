package models.animals;

import java.util.Random;

public class Waxwing extends Bird {
	

	public Waxwing() {
		this("Waxwing", 2, true, 121, 1.2, 0.1);
	}
	
	public Waxwing(String name, int nrOfLegs, boolean migrates, int avgFlightAltitude,double maintenanceCost, double dangerPerc) {
		setName(name);
		setNrOfLegs(nrOfLegs);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
		setMaintenanceCost(maintenanceCost);
		setDangerPerc(dangerPerc);
		}

	@Override
	public boolean kill() {
		Random random = new Random();
		int survivingOdds = random.nextInt(10);
		
		if ((survivingOdds/10) < dangerPerc){
			return true;
		}
		return false;
	}
}
