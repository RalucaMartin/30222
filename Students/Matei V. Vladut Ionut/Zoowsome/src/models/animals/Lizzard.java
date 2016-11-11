package models.animals;

import java.util.Random;

public class Lizzard extends Reptile {

	public Lizzard() {
		this("Lizzard", 4, true, 2.9, 0.2);
	}

	public Lizzard(String name, int nrOfLegs, boolean layEggs, double maintenanceCost, double dangerPerc){
		setName(name);
		setNrOfLegs(nrOfLegs);
		setLayEggs(layEggs);
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
