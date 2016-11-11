package models.animals;

import java.util.Random;

public class Crocodile extends Reptile{

	public Crocodile() {
		this("Croco", 4, true, 6, 0.6);
	}
	
	public Crocodile(String name, int nrOfLegs, boolean layEggs, double maintenanceCost, double dangerPerc){
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
