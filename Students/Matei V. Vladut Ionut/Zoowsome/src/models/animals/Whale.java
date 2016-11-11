package models.animals;

import java.util.Random;

public class Whale extends Aquatic {

	public Whale() {
		this("Whale", 0, 132, Water.SALTWATER, 2.3, 0.3);		
	}
	
	public Whale(String name, int nrOfLegs, int avgSwimDepth, Water waterType, double maintenanceCost, double dangerPerc){

		setName(name);
		setNrOfLegs(nrOfLegs);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(waterType);
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
