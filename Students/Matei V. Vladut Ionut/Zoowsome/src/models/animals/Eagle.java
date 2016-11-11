package models.animals;

import java.util.Random;

public class Eagle extends Bird {
	
	public Eagle() {
		this("Eagle", 2, false, 589, 4.5, 0.6);
	}

	public Eagle(String name, int nrOfLegs, boolean migrates, int avgFlightAltitude,double maintenanceCost, double dangerPerc) {
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
